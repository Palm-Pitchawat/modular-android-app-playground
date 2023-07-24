package com.playground.modular.app.core.network

interface WeatherNetworkDataSource {

    suspend fun getWeatherDetail()
}