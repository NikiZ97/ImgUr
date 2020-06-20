package com.nikiz.data.repository.datasource

import com.nikiz.data.network.model.Gallery
import com.nikiz.domain.model.GalleryModel

interface GalleryDataStore {
    suspend fun getDefaultGalleryForDay(): List<GalleryModel>
}