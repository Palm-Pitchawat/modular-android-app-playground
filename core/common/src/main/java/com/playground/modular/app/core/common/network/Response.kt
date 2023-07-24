package com.playground.modular.app.core.common.network

sealed interface Response<out T> {
    object Loading : Response<Nothing>
    data class Success<T>(val data: T) : Response<T>
    data class Error(val exception: Throwable? = null) : Response<Nothing>
}