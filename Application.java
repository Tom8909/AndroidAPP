package com.example.tom.androidapp;


import com.backendless.Backendless;

public class Application extends android.app.Application
{
    public static final String APPLICATION_ID = "E0A45911-C106-5FF2-FF08-F7C69867F900";
    public static final String API_KEY = "2F14B956-3174-2954-FF01-B9BF30245900";
    public static final String SERVER_URL = "https://api.backendless.com";

    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }
}
