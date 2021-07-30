package com.example.sunnyweather.logic.network;


import com.example.sunnyweather.logic.model.PlaceResponse;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import retrofit2.Call;

/***************数据源访问入口**********/
public class SunnyWeatherNetWork {
    private static SunnyWeatherNetWork sunnyWeatherNetWork;
    private static PlaceService placeService = (PlaceService) ServiceCreator.getServiceCreator().create(PlaceService.class);

    private SunnyWeatherNetWork(){}

    public Object searchPlaces(String query){
        return this.await(placeService.searchPlaces(query));
    }

    private Object await(Call<PlaceResponse> searchPlaces) {
        return this;
    }

    public static synchronized SunnyWeatherNetWork getSunnyWeatherNetWork(){
        if(sunnyWeatherNetWork == null){
            sunnyWeatherNetWork = new SunnyWeatherNetWork();
        }
        return sunnyWeatherNetWork;
    }
}
