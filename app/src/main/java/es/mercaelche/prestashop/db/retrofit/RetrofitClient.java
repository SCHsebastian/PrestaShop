package es.mercaelche.prestashop.db.retrofit;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModelProvider;

import java.io.IOException;

import es.mercaelche.prestashop.db.classes.User;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jaxb.JaxbConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

/*    private static Retrofit retrofit = null;
    private static OkHttpClient client = null;*/
    private static UserApi API_SERVICE;

    private static final String API_KEY = "T8748FNG4B66MS6R4GR1PEAKZJQHN9S6";


    public static UserApi getApiService() {
        // Creamos un interceptor y le indicamos el log level a usar
        final HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        // Asociamos el interceptor a las peticiones
        final OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        httpClient.addInterceptor(logging);

        httpClient.addInterceptor(new Interceptor() {
            @NonNull
            @Override
            public Response intercept(@NonNull Chain chain) throws IOException {
                Request request = chain.request().newBuilder().removeHeader("Content-Type").build();
                return chain.proceed(request);
            }
        });

        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://casadelafortuna.es/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient.build()) // <-- set log level
                    .build();

            API_SERVICE = retrofit.create(UserApi.class);
        }

        return API_SERVICE;
    }


/*    public static Retrofit getClientJSON(String baseUrl,OkHttpClient cliente) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .client(cliente)
*//*                    .addConverterFactory(JaxbConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())*//*
                    .build();
        }
        return retrofit;
    }

    public static OkHttpClient getInterceptor(){
        if (client==null){
            client = new OkHttpClient.Builder()
                    .addInterceptor(new ApiResponseInterceptor())
                    .build();
        }
        return client;
    }*/
}
