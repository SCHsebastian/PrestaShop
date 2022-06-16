package es.mercaelche.prestashop.ui.home;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.Collections;
import java.util.List;

import es.mercaelche.prestashop.databinding.FragmentHomeBinding;
import es.mercaelche.prestashop.db.classes.User;
import es.mercaelche.prestashop.db.retrofit.ApiUtils;
import es.mercaelche.prestashop.db.retrofit.UserApi;
import es.mercaelche.prestashop.db.retrofit.responses.BaseResponse;
import es.mercaelche.prestashop.utils.dialogs.RegisterDialog;
import okhttp3.Headers;
import okhttp3.internal.http2.Header;
import retrofit2.Call;
import retrofit2.Callback;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private UserApi userApi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.tvTitulo;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        iniciarUi(homeViewModel);
        userApi = ApiUtils.getUserApi();


        return root;
    }

    private void iniciarUi(HomeViewModel v) {

        EditText etCorreo = binding.etCorreo;
        EditText etPass = binding.etPass;

        Button btnIniciar = binding.btnIniciarSesion;
        Button btnRegistrar = binding.btnRegistrarse;

        btnIniciar.setOnClickListener(v1 -> {
            String correo = etCorreo.getText().toString();
            String pass = etPass.getText().toString();
            login(correo, pass);
        });

        btnRegistrar.setOnClickListener(v1 -> {

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
        userApi.login(email,pass).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, retrofit2.Response<User> response) {
                if (response.isSuccessful()) {
                    User user = response.body();
                    user.setCookie(response.headers().get("set-cookie"));
                    Log.d("Login", "Login correcto: " + user.toString());
                    Log.d("Token", ""+user.getCookie());
                } else {
                    Toast.makeText(getContext(), "Error al iniciar sesión" + response.message(), Toast.LENGTH_SHORT).show();
                }
                Log.d("Error", response.message()+ " "+response.code());
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                Toast.makeText(getContext(), "Error al iniciar sesión"+ t.getMessage(), Toast.LENGTH_SHORT).show();
                Log.d("Error", t.getMessage());
            }
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}