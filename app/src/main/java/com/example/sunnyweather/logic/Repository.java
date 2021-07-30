package com.example.sunnyweather.logic;

import androidx.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.sunnyweather.R;
import com.example.sunnyweather.logic.model.PlaceResponse;
import com.example.sunnyweather.logic.network.SunnyWeatherNetWork;

import java.util.List;

import javax.xml.transform.Result;

import kotlinx.coroutines.Dispatchers;
import okhttp3.Dispatcher;

public class Repository {
    private static Repository repository;

    private Repository(){};

    public static synchronized Repository getRepository(){
        if(repository == null){
            repository = new Repository();
        }
        return repository;
    }

    public LiveData searchPlaces(String query){
        return null;
    }


}
