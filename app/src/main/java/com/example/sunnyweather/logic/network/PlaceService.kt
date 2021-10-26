package com.example.sunnyweather.logic.network

import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token={SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
    //searchPlaces()方法的返回值被声明成了Call<PlaceResponse>，这样Retrofit就会将服务器返回的JSON数据自动解析成PlaceResponse对象了
}