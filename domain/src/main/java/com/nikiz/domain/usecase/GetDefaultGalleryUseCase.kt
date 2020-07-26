package com.nikiz.domain.usecase

import com.nikiz.domain.model.GalleryModel

interface GetDefaultGalleryUseCase {
    suspend fun getDefaultGallery(): DataState<List<GalleryModel>>
}