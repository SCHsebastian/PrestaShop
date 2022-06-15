package es.mercaelche.prestashop.db.retrofit;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;

public interface StandarApi {

    @GET("/api")
    @FormUrlEncoded
    Call<Response> test(@Field("ws_key") String ws_key);

}
