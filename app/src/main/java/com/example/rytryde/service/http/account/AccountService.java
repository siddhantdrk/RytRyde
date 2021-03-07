package com.example.rytryde.service.http.account;

import com.example.rytryde.App;
import com.google.gson.Gson;

import java.util.HashMap;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class AccountService implements IAccountService{

    public static String domain="https://rytryde.com";
    public static String route="/api";
    public static String base= domain+route;
    public static MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private OkHttpClient httpClient = App.getApp().getOkHttpClient();

    public static String login = base+"/login";
    Response response = null;

    @Override
    public Response login(String email, String password) {
        HashMap<String, String> userinfo = new HashMap<>();
        userinfo.put("email", email);
        userinfo.put("password", password);
        userinfo.put("device_id","null");
        userinfo.put("device_type","android");



        Gson gson = new Gson();
        Request request = new Request.Builder()
                .url(login)
                .post(RequestBody.create(JSON, gson.toJson(userinfo)))
                .build();


        try {

            response = httpClient.newCall(request).execute();

            if (response.isSuccessful()) {

                return response;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }
}
