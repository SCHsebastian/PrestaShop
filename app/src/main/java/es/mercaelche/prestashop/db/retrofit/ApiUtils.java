package es.mercaelche.prestashop.db.retrofit;

import es.mercaelche.prestashop.db.retrofit.responses.LoginResponse;

public class ApiUtils {

    public static final String BASE_URL = "https://casadelafortuna.es/rest/";

    public static UserApi gerUserApi() {
        return RetrofitClient.getClient(BASE_URL).create(UserApi.class);
    }
}
