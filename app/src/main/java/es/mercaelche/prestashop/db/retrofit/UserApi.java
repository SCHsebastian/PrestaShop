package es.mercaelche.prestashop.db.retrofit;

import java.util.List;

import es.mercaelche.prestashop.db.retrofit.responses.LoginResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserApi {

    @POST("/rest/login")
    @FormUrlEncoded
    Call<LoginResponse> login(@Field("email") String email,
                              @Field("password") String passwd);

    @GET("/rest/logout")
    @FormUrlEncoded
    Call<LoginResponse> logout();

}
