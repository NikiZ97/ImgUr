package com.nikiz.data.network.interceptor

import okhttp3.Interceptor
import okhttp3.Response

class ClientIdHeaderInterceptor(private val clientId: String): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        var request = chain.request()
        val requestBuilder = request.newBuilder();
        request = requestBuilder.addHeader("Authorization", "Client-ID $clientId").build()
        return chain.proceed(request)
    }
}