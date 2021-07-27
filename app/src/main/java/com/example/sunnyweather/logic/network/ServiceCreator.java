package com.example.sunnyweather.logic.network;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*******Retrofit构建器*******/
public class ServiceCreator {
    private static ServiceCreator serviceCreator;
    private static final String BASE_URL = "https://api.caiyunapp.com";
    private static Retrofit retrofit = (new Retrofit.Builder())
            .baseUrl("https://api.caiyunapp.com/")
            .addConverterFactory((Converter.Factory)GsonConverterFactory.create())
            .build();;

    private ServiceCreator(){};
    public static synchronized ServiceCreator getServiceCreator(){
        if(serviceCreator == null){
            return new ServiceCreator();
        }else{
            return serviceCreator;
        }
    }

    public Object create(Class<Object> serviceClass){
        return retrofit.create(serviceClass);
    }

    public Object create(){
        return this.create(Object.class);
    }
}
