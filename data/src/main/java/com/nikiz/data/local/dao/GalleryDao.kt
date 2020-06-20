package com.nikiz.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.nikiz.data.local.entity.GalleryEntity

@Dao
interface GalleryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertDefaultGallery(gallery: GalleryEntity)

    @Query("SELECT * FROM GalleryEntity")
    suspend fun getDefaultGallery(): GalleryEntity
}