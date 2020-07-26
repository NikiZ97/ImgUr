package com.nikiz.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nikiz.data.local.dao.GalleryDao
import com.nikiz.data.local.dao.ImgurDao
import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.local.entity.GalleryImageEntity
import com.nikiz.data.local.entity.GalleryTagEntity

@Database(entities = [GalleryEntity::class, GalleryImageEntity::class, GalleryTagEntity::class],
    version = 3, exportSchema = false)
@TypeConverters(com.nikiz.data.local.type_converters.TypeConverters::class)
abstract class AppDatabase: RoomDatabase() {
    companion object {
        const val DATABASE_NAME = "imgur_database"
    }
    abstract fun imgurDao(): ImgurDao
    abstract fun galleryDao(): GalleryDao
}