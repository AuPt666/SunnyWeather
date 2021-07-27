package com.example.sunnyweather.logic.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/******令牌获取的天气信息所对应的JSON字段******/
public class PlaceResponse {
    private String status;//获取的结果状态
    private List<Place> places;//获取的匹配地域列表对映的天气信息

    PlaceResponse(String status, List<Place> places){
        this.status = status;
        this.places = places;
    }

    public String getStatus() {
        return status;
    }

    public List getPlaces() {
        return places;
    }
}

