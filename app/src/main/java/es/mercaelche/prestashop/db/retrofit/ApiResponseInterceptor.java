package es.mercaelche.prestashop.db.retrofit;

import com.google.gson.Gson;

import java.io.IOException;

import es.mercaelche.prestashop.db.retrofit.binshop.BaseResponse;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/*
public class ApiResponseInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        Response response = chain.proceed(request);
        final ResponseBody body = response.body();
        BaseResponse apiResponse = body;
        body.close();

        // TODO any logic regarding ApiResponse#status or #code you need to do

        final Response.Builder newResponse = response.newBuilder()
                .body(ResponseBody.create(JSON, apiResponse.getPsdata().toString()));
        return newResponse.build();
    }
}
*/
