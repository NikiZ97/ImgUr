package com.nikiz.data.repository

import com.nikiz.data.repository.datasource.GalleryDataStoreFactory
import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.repository.GalleryDataRepository
import com.nikiz.domain.usecase.DataState

class GalleryDataRepositoryImp(private val galleryDataStoreFactory: GalleryDataStoreFactory) :
    GalleryDataRepository {

    override suspend fun getDefaultGalleryForDay(reload: Boolean): DataState<List<GalleryModel>> {
        val priority = if (reload) GalleryDataStoreFactory.Priority.CLOUD else GalleryDataStoreFactory.Priority.CACHE
        val dataSource = galleryDataStoreFactory.create(priority)
        return dataSource.getDefaultGalleryForDay()
    }
}