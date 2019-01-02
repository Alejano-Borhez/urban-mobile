package com.urbantrans.http;

import java.util.Map;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class RetrofitSingleton {
    private static RetrofitSingleton singleton;
    private Retrofit retrofit;
    private Map<Class<?>, Object> clients;

    private RetrofitSingleton() {
        this.retrofit = getRetrofit();

    }

    public static synchronized RetrofitSingleton INSTANCE () {
        if (singleton == null) {
            singleton = new RetrofitSingleton();
        }
        return singleton;
    }

    private Retrofit getRetrofit() {
        if (this.retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("http://localhost:8080/api")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    @SuppressWarnings("unchecked")
    public <T> T getClient(Class<T> clientClass) {
        Object client = clients.get(clientClass);
        if (client == null) {
            client = getRetrofit().create(clientClass);
            clients.put(clientClass, client);
            return (T) client;
        } else {
            return (T) client;
        }
    }

}
