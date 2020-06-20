package com.nikiz.data.repository.datasource

import com.nikiz.data.exception.ServerUnavailableException
import com.nikiz.data.local.dao.GalleryDao
import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.mapper.GalleryToGalleryEntityMapper
import com.nikiz.data.mapper.GalleryToGalleryModelMapper
import com.nikiz.data.network.ImgurService
import com.nikiz.data.network.model.Gallery
import com.nikiz.domain.model.GalleryModel
import java.lang.Exception

class CloudGalleryDataSource(private val imgurService: ImgurService,
                             private val galleryDao: GalleryDao,
                             private val galleryToGalleryEntityMapper: GalleryToGalleryEntityMapper,
                             private val galleryToGalleryModelMapper: GalleryToGalleryModelMapper) : GalleryDataStore {
    override suspend fun getDefaultGalleryForDay(): List<GalleryModel> {
        try {
            val galleryAsync = imgurService.getDefaultGalleryForDay()
            val result = galleryAsync.await()
            result.galleryData.forEach {
                val galleryEntity = galleryToGalleryEntityMapper.map(it)
                galleryDao.insertDefaultGallery(galleryEntity)
            }
            return galleryToGalleryModelMapper.map(result.galleryData)
        } catch (e: Exception) {
            throw ServerUnavailableException()
        }
    }
}