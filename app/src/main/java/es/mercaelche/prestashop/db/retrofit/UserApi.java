package es.mercaelche.prestashop.db.retrofit;

import es.mercaelche.prestashop.db.classes.User;
import es.mercaelche.prestashop.db.retrofit.binshop.BaseResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface UserApi {

    @POST("/rest/login")
    @FormUrlEncoded
    Call<User> login(@Field("email") String email,
                     @Field("password") String passwd);

   @POST("/rest/register")
   @FormUrlEncoded
   Call<BaseResponse> register(@Field("email") String email,
                               @Field("password") String passwd,
                               @Field("firstname") String firstname,
                               @Field("lastname") String lastname);

    @GET("/rest/logout")
    Call<BaseResponse> logout(@Header("Cookie") String cookie);

    @GET("/rest")
    Call<BaseResponse> test();

}
