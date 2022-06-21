package es.mercaelche.prestashop.db.retrofit;

import androidx.annotation.NonNull;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class RetrofitClient {

/*    private static Retrofit retrofit = null;
    private static OkHttpClient client = null;*/
    private static UserApi API_SERVICE;
    private static StandarApi API_PRESTASHOP;

    private static final String API_KEY = "T8748FNG4B66MS6R4GR1PEAKZJQHN9S6";

    private static OkHttpClient getInterceptor(){
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

        return httpClient.build();
    }

    public static UserApi getApiService() {


        if (API_SERVICE == null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ApiUtils.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(getInterceptor()) // <-- set log level
                    .build();

            API_SERVICE = retrofit.create(UserApi.class);
        }

        return API_SERVICE;
    }


    public static StandarApi getClienteXML() {
        if (API_PRESTASHOP==null) {
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(ApiUtils.BASE_URL)
                    .addConverterFactory(SimpleXmlConverterFactory.create())
                    .client(getInterceptor())
                    .build();
            API_PRESTASHOP = retrofit.create(StandarApi.class);
        }
        return API_PRESTASHOP;
    }
}
