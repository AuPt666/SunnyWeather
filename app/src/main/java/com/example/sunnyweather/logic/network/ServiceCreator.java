package com.example.sunnyweather.logic.network;

import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*******Retrofit构建器*******/
public class ServiceCreator {
    private static ServiceCreator serviceCreator;
    private static final String BASE_URL = "https://api.caiyunapp.com";
    private Retrofit retrofit ;

    private ServiceCreator(){
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();;
    };
    public static synchronized ServiceCreator getServiceCreator(){
        if(serviceCreator == null){
            serviceCreator = new ServiceCreator();
        }
        return serviceCreator;
    }


    //创建一个网络请求接口的实例并输出
    public PlaceService create(Class serviceClass){
        return (PlaceService) retrofit.create(serviceClass);
    }

    public Object create(){
        return this.create(Class.class);
    }
}
