package com.nikiz.data.repository.datasource

import com.nikiz.data.local.dao.GalleryDao
import com.nikiz.data.mapper.GalleryEntityToGalleryModelMapper
import com.nikiz.data.network.model.Gallery
import com.nikiz.domain.model.GalleryModel

class LocalGalleryDataSource(private val galleryDao: GalleryDao,
                             private val galleryEntityToGalleryModelMapper: GalleryEntityToGalleryModelMapper) :
    GalleryDataStore {

    override suspend fun getDefaultGalleryForDay(): GalleryModel {
        return galleryEntityToGalleryModelMapper.map(galleryDao.getDefaultGallery())
    }
}