package com.nikiz.data.repository.datasource

import com.nikiz.data.network.model.Gallery
import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.usecase.DataState

interface GalleryDataStore {
    suspend fun getDefaultGalleryForDay(): DataState<List<GalleryModel>>
}