package es.mercaelche.prestashop.db.retrofit;

import es.mercaelche.prestashop.db.retrofit.prestashop.ResponseProduct;
import es.mercaelche.prestashop.db.retrofit.prestashop.ResponseProductos;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface StandarApi {

    /*@GET("/api")
    Call<prestashop> test(@Query("ws_key") String ws_key);*/

    @GET("/api/products")
    Call<ResponseProductos> getProducts(@Query("ws_key") String ws_key);

    @GET("/api/products/{id}")
    Call<ResponseProduct> getProduct(@Path("id")int id, @Query("ws_key") String ws_key);

}
