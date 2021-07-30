package com.example.sunnyweather;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

/*******用于在全局获取context和天气令牌********/
public class SunnyWeatherApplication extends Application {
    @SuppressLint("StaticFieldLeak")
    public static Context context;
    public static final String TOKEN = "9yF91QzioUsEahWd";//天气令牌

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();//全局Context
    }
}
