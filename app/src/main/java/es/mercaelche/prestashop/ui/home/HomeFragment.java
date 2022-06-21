package es.mercaelche.prestashop.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.List;

import es.mercaelche.prestashop.databinding.FragmentHomeBinding;
import es.mercaelche.prestashop.db.PrestaDB;
import es.mercaelche.prestashop.db.UserDao;
import es.mercaelche.prestashop.db.UserDb;
import es.mercaelche.prestashop.db.classes.User;
import es.mercaelche.prestashop.db.retrofit.ApiUtils;
import es.mercaelche.prestashop.db.retrofit.UserApi;
import es.mercaelche.prestashop.db.retrofit.binshop.BaseResponse;
import es.mercaelche.prestashop.db.retrofit.prestashop.ResponseProduct;
import es.mercaelche.prestashop.utils.adapters.AdaptProductos;
import es.mercaelche.prestashop.utils.dialogs.RegisterDialog;
import retrofit2.Call;
import retrofit2.Callback;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private UserApi userApi;
    private PrestaDB db;
    private UserDao userDao;
    private HomeViewModel homeViewModel;
    private AdaptProductos adaptProductos;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new HomeViewModel(getActivity());

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        iniciarUi();
        userApi = ApiUtils.getUserApi();


        return root;
    }

    private void iniciarUi() {
        db = PrestaDB.getInstance(getActivity());
        userDao = db.userDao();

        if(!isSesionActiva()) {
            uiInicioSesion();
        }else {
            uiProductos();
        }

    }

    private boolean isSesionActiva() {
        UserDb usuario = userDao.getUser();
        if (usuario!=null)
            return true;
        return false;
    }

    private void uiProductos() {

        binding.lytProductos.setVisibility(View.VISIBLE);
        LiveData<List<ResponseProduct.product>> productos = homeViewModel.getProducts();

        productos.observe(getViewLifecycleOwner(), listaProductos -> {
            if (listaProductos.size()>0){
                RecyclerView lstProductos = binding.rvProductos;
                lstProductos.setLayoutManager(new LinearLayoutManager(getContext()));
                adaptProductos = new AdaptProductos(listaProductos, getContext());
                lstProductos.setAdapter(adaptProductos);
            }
        });

        binding.btReload.setOnClickListener(view -> {
            homeViewModel.loadProductos();
        });

    }

    private void uiInicioSesion() {

        binding.lytSesion.setVisibility(View.VISIBLE);

        EditText etCorreo = binding.etCorreo;
        EditText etPass = binding.etPass;

        binding.btnIniciarSesion.setOnClickListener(v1 -> {
            String correo = etCorreo.getText().toString();
            String pass = etPass.getText().toString();
            login(correo, pass);
        });

        binding.btnRegistrarse.setOnClickListener(v1 -> {

            RegisterDialog dialog = RegisterDialog.newInstance();

            RegisterDialog.OnRegisterListener listener = this::registrar;
            dialog.setOnRegisterListener(listener);

            dialog.show(getParentFragmentManager(), "RegisterDialog");

        });

    }

    private void registrar(String correo, String pass, String nombre, String apellidos) {
        userApi.register(correo, pass, nombre, apellidos).enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, retrofit2.Response<BaseResponse> response) {
                if (response.isSuccessful()) {
                    Toast.makeText(getContext(), "Login : "+response.message(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), "Error al registrar usuario" + response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error al registrar usuario"+ t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login(String email, String pass) {
        userApi.login(email,pass).enqueue(new Callback<BaseResponse>() {
            @Override
            public void onResponse(Call<BaseResponse> call, retrofit2.Response<BaseResponse> response) {
                if (response.isSuccessful()) {
                    User user = response.body().getPsdata().getUser();
                    if (user!=null){
                        UserDb antiguo = db.userDao().getUser();
                        if (antiguo!=null){
                            db.userDao().delete(antiguo);
                        }
                        setCookie(response.headers().get("set-cookie"), user);
                        db.userDao().insert(new UserDb(user.getFirstname(),user.getLastname(),user.getEmail(), user.getCookieName(), user.getCookieValue()));
                        binding.lytSesion.setVisibility(View.GONE);
                        uiProductos();
                    }else {
                        Toast.makeText(getContext(), "Error al iniciar sesión" + response.message(), Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(getContext(), "Error al iniciar sesión" + response.message(), Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                Toast.makeText(getContext(), "Error al iniciar sesión"+ t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("Error", t.getMessage());
            }
        });
    }

    private void setCookie(String s,User user) {

        List<String> splitted = Arrays.asList(s.split(";"));
        List<String> doubleSplitted = Arrays.asList(splitted.get(0).split("="));

        user.setCookieName(doubleSplitted.get(0));
        user.setCookieValue(doubleSplitted.get(1));

    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}