package com.nikiz.domain.usecase

import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.repository.GalleryDataRepository

class GetDefaultGalleryUseCaseImp(private val galleryDataRepository: GalleryDataRepository)
    :GetDefaultGalleryUseCase {

    override suspend fun getDefaultGallery(): DataState<List<GalleryModel>> {
        return galleryDataRepository.getDefaultGalleryForDay(true)
    }
}