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

import es.mercaelche.prestashop.databinding.FragmentHomeBinding;
import es.mercaelche.prestashop.db.classes.User;
import es.mercaelche.prestashop.db.retrofit.ApiUtils;
import es.mercaelche.prestashop.db.retrofit.UserApi;
import es.mercaelche.prestashop.db.retrofit.responses.LoginResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
        userApi = ApiUtils.gerUserApi();


        return root;
    }

    private void iniciarUi(HomeViewModel v) {



        EditText etCorreo = binding.etCorreo;
        EditText etPass = binding.etPass;

        Button btnIniciar = binding.btnIniciarSesion;

        btnIniciar.setOnClickListener(v1 -> {
            String correo = etCorreo.getText().toString();
            String pass = etPass.getText().toString();
            login(correo, pass);
        });

    }

    private void login(String correo, String pass) {
        userApi.login(correo, pass).enqueue(new Callback<LoginResponse>() {

            @Override
            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
                String data = response.toString();
                Log.d("Login", data);
                if (response.isSuccessful()) {
                    LoginResponse loginResponse = response.body();
                    if (loginResponse.getCode() == 200) {
                        User user = loginResponse.getPsdata().getUser();
                        Toast.makeText(getContext(), "Bienvenido " + user.getFirstname(), Toast.LENGTH_LONG).show();
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginResponse> call, Throwable t) {
                Log.d("Login", t.getMessage());
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}