package es.mercaelche.prestashop.db.retrofit;

import es.mercaelche.prestashop.db.classes.User;
import es.mercaelche.prestashop.db.retrofit.binshop.BaseResponse;
import es.mercaelche.prestashop.db.retrofit.binshop.Psdata;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserApi {

    @POST("/rest/login")
    Call<BaseResponse> login(@Query(value = "email", encoded = true) String email,
                       @Query("password") String passwd);

   @POST("/rest/register?")
   Call<BaseResponse> register(@Field(value = "email" , encoded = true) String email,
                               @Field("password") String passwd,
                               @Field("firstname") String firstname,
                               @Field("lastname") String lastname);

    @GET("/rest/logout")
    Call<BaseResponse> logout(@Header("Cookie") String cookie);

    @GET("/rest")
    Call<BaseResponse> test();

}
