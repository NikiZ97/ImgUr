package com.nikiz.domain.repository

import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.usecase.DataState
import kotlinx.coroutines.Deferred

interface GalleryDataRepository {
    suspend fun getDefaultGalleryForDay(reload: Boolean = false): DataState<List<GalleryModel>>
}