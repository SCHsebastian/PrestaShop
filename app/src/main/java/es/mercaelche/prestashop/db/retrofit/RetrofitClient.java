package es.mercaelche.prestashop.db.retrofit;

import androidx.lifecycle.ViewModelProvider;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.jaxb.JaxbConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitClient {

    private static Retrofit retrofit = null;
    private static Retrofit retrofitXML = null;

    private static String API_KEY = "T8748FNG4B66MS6R4GR1PEAKZJQHN9S6";


    public static Retrofit getClientJSON(String baseUrl) {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(baseUrl)
                    .addConverterFactory(JaxbConverterFactory.create())
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
