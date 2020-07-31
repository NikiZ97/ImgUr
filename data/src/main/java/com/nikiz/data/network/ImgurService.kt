package com.nikiz.data.network

import com.nikiz.data.network.model.Gallery
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ImgurService {

    @GET("gallery/hot/viral/day/1")
    fun getDefaultGalleryForDay(): Deferred<Gallery>
}