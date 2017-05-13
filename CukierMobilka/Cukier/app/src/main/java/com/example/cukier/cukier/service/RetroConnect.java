package com.example.cukier.cukier.service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Kamil on 13.05.2017.
 */

public class RetroConnect {
    public static final String BASE_URL = "http://jsonplaceholder.typicode.com/";
    public static final String WS_URL = "http://192.168.0.16:8080/";
    private Retrofit retrofit;


    private static RetroConnect retroInstance;

    public static RetroConnect getInstance() {
        if (null == retroInstance) {
            synchronized (RecipeServiceManager.class) {
                if (null == retroInstance) {
                    retroInstance = new RetroConnect();
                }
            }
        }
        return retroInstance;
    }

    private RetroConnect() {
        retrofit = new Retrofit.Builder()
                .baseUrl(WS_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
