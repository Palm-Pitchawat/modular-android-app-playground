package com.playground.modular.app.core.network.di

import com.playground.modular.app.core.network.WeatherNetworkDataSource
import com.playground.modular.app.core.network.WeatherNetworkDataSourceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class NetworkModule {

    @Binds
    @Singleton
    abstract fun bindWeatherNetworkDataSource(
        weatherNetworkDataSourceImpl: WeatherNetworkDataSourceImpl
    ): WeatherNetworkDataSource
}