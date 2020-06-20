package com.nikiz.domain.repository

import com.nikiz.domain.model.GalleryModel
import kotlinx.coroutines.Deferred

interface GalleryDataRepository {
    suspend fun getDefaultGalleryForDay(reload: Boolean): GalleryModel
}