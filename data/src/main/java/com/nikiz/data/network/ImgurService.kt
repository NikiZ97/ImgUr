package com.nikiz.data.network

import com.nikiz.data.network.model.Gallery
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface ImgurService {

    @GET("hot/viral/day/1?showViral=true&mature=true&album_previews=true")
    fun getDefaultGalleryForDay(): Deferred<Gallery>
}