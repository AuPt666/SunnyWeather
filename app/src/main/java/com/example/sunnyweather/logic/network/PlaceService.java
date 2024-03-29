package com.example.sunnyweather.logic.network;

import com.example.sunnyweather.SunnyWeatherApplication;
import com.example.sunnyweather.logic.model.PlaceResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**********搜索地址API的Retrofit接口**********/
public interface PlaceService {
    @GET("v2/place?token=" + SunnyWeatherApplication.TOKEN + "&lang = zh_CN")
    Call<PlaceResponse> searchPlaces(@Query("query") String query);
}
