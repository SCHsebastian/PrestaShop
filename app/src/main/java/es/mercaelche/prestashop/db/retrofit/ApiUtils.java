package es.mercaelche.prestashop.db.retrofit;

public class ApiUtils {

    public static final String BASE_URL = "https://casadelafortuna.es/";

    public static UserApi gerUserApiJSON() {
        return RetrofitClient.getClientJSON(BASE_URL).create(UserApi.class);
    }

    public static StandarApi getUserApiXML() {
        return RetrofitClient.getClientXML(BASE_URL).create(StandarApi.class);
    }
}
