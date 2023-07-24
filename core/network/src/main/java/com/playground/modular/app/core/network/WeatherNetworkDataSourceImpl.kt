package com.playground.modular.app.core.network

import com.playground.modular.app.core.network.retrofit.WeatherRetrofitApi
import javax.inject.Inject

class WeatherNetworkDataSourceImpl @Inject constructor(
    private val weatherRetrofitApi: WeatherRetrofitApi
) : WeatherNetworkDataSource {
    override suspend fun getWeatherDetail() {
        weatherRetrofitApi.getWeatherDetail(0.0,0.0)
    }
}