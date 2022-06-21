package es.mercaelche.prestashop.ui.home;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

import es.mercaelche.prestashop.R;
import es.mercaelche.prestashop.db.retrofit.ApiUtils;
import es.mercaelche.prestashop.db.retrofit.StandarApi;
import es.mercaelche.prestashop.db.retrofit.prestashop.ResponseProduct;
import es.mercaelche.prestashop.db.retrofit.prestashop.ResponseProductos;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<List<ResponseProduct.product>> mProducts;
    private List<ResponseProduct.product> productos;
    private StandarApi prestaApi;
    private Context context;

    HomeViewModel(Context context){
        prestaApi = ApiUtils.getPrestaApi();
        this.context = context;
    }

    public MutableLiveData<List<ResponseProduct.product>> getProducts() {
        if (mProducts == null){
            mProducts = new MutableLiveData<>();
            loadProductos();
        }
        return mProducts;
    }

/*    public void loadProductos() {
        prestaApi.getProducts(ApiUtils.API_KEY).enqueue(new Callback<Prestashop>() {
            @Override
            public void onResponse(Call<Prestashop> call, Response<Prestashop> response) {
                Log.d("datos de xml", response.body().toString());
            }

            @Override
            public void onFailure(Call<Prestashop> call, Throwable t) {

            }
        });

    }*/

    public void loadProductos(){
        prestaApi.getProducts(ApiUtils.API_KEY).enqueue(new Callback<ResponseProductos>() {
            @Override
            public void onResponse(Call<ResponseProductos> call, Response<ResponseProductos> response) {
                Log.d("dato",response.message());
                /*Products items = response.body().getProducts();*/
                /*obtenerProductos(items);*/
            }

            @Override
            public void onFailure(Call<ResponseProductos> call, Throwable t) {
                Log.w("Error", t.toString() + call.toString());
                Log.w("Error",context.getString(R.string.error_carga_productos));
            }
        });
    }

    /*private void obtenerProductos(Products items) {

        for (Product item:
                items.getProduct()) {
            prestaApi.getProduct(item.getId(), ApiUtils.API_KEY).enqueue(new Callback<Prestashop>() {
                @Override
                public void onResponse(Call<Prestashop> call, Response<Prestashop> response) {
                    productos.add(response.body().getProduct());
                    mProducts.setValue(productos);
                }

                @Override
                public void onFailure(Call<Prestashop> call, Throwable t) {
                    Log.d("Obtener productos: ", t.getLocalizedMessage());
                }
            });
        }

    }*/
}