package com.example.sunnyweather.logic.model;

import com.google.gson.annotations.SerializedName;

/*********JSON文件的地域字段************/
public class Place {
    private String name;//地域名称
    private Location location;//地域位置

    @SerializedName("formatted_address")
    private String address;//所处地区地址

    Place(String name, Location location, String address) {
        this.name = name;
        this.location = location;
        this.address = address;
    }

    public Location getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
