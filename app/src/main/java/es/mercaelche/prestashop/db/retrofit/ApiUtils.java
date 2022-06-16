package es.mercaelche.prestashop.db.retrofit;

public class ApiUtils {

    public static final String BASE_URL = "https://casadelafortuna.es/";

    public static UserApi getUserApi() {
        return RetrofitClient.getClientJSON(BASE_URL).create(UserApi.class);
    }

}
