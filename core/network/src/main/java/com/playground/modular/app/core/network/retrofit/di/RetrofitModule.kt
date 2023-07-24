package com.playground.modular.app.core.network.retrofit.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.playground.modular.app.core.network.retrofit.WeatherRetrofitApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Converter
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Provides
    @Singleton
    fun providesJsonConverterConfiguration(): Json = Json {
        ignoreUnknownKeys = true
    }

    @Provides
    @Singleton
    fun providesJsonConverter(jsonConverterConfiguration: Json): Converter.Factory {
        return jsonConverterConfiguration.asConverterFactory("application/json".toMediaType())
    }

    @Provides
    @Singleton
    fun providesWeatherNetworkApi(
        okHttpClient: OkHttpClient,
        jsonConverter: Converter.Factory
    ): WeatherRetrofitApi {
        return Retrofit.Builder()
            .baseUrl("https://api.open-meteo.com/")
            .client(okHttpClient)
            .addConverterFactory(jsonConverter)
            .build()
            .create(WeatherRetrofitApi::class.java)
    }
}