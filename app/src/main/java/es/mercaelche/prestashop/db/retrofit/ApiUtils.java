package es.mercaelche.prestashop.db.retrofit;

public class ApiUtils {

    public static final String BASE_URL = "https://casadelafortuna.es/";
    public static final String API_KEY = "T8748FNG4B66MS6R4GR1PEAKZJQHN9S6";

    public static UserApi getUserApi() {
        return RetrofitClient.getApiService();
    }

    public static StandarApi getPrestaApi(){
        return RetrofitClient.getClienteXML();
    }


}
