package com.example.sunnyweather.logic.model;


/*************JSON文件获取的地理位置信息*************/
public class Location {
    private String lng;//地址经度
    private String lat;//地址纬度

    Location(String lng, String lat) {
        this.lng = lng;
        this.lat = lat;
    }

    public String getLat() {
        return lat;
    }

    public String getLng() {
        return lng;
    }
}
