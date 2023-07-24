package com.playground.modular.app.core.common.flow

import com.playground.modular.app.core.common.network.Response
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart

fun <T> Flow<T>.asResponse(): Flow<Response<T>> {
    return this
        .map<T, Response<T>> {
            Response.Success(it)
        }
        .onStart {
            emit(Response.Loading)
        }
        .catch {
            emit(Response.Error(it))
        }
}