package com.nikiz.data.repository.datasource

import com.nikiz.data.local.dao.GalleryDao
import com.nikiz.data.mapper.GalleryEntityToGalleryModelMapper
import com.nikiz.data.network.model.Gallery
import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.usecase.DataState

class LocalGalleryDataSource(private val galleryDao: GalleryDao,
                             private val galleryEntityToGalleryModelMapper: GalleryEntityToGalleryModelMapper) :
    GalleryDataStore {

    override suspend fun getDefaultGalleryForDay(): DataState<List<GalleryModel>> {
        val entities = galleryDao.getDefaultGallery()
        val galleryModels = mutableListOf<GalleryModel>()
        entities.forEach {
            galleryModels.add(galleryEntityToGalleryModelMapper.map(it))
        }
        return DataState.Success(galleryModels)
    }
}