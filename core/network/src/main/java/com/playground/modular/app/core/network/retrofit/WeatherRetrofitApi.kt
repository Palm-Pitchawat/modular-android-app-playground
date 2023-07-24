package com.playground.modular.app.core.network.retrofit

import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherRetrofitApi {

    @GET("")
    suspend fun getWeatherDetail(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    )
}