package com.nikiz.data.local.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.nikiz.data.local.entity.GalleryImageEntity
import com.nikiz.data.local.entity.GalleryTagEntity

class TypeConverters {

    @TypeConverter
    fun fromGalleryImageEntities(entities: List<GalleryImageEntity>): String {
        return Gson().toJson(entities)
    }

    @TypeConverter
    fun toGalleryImageEntities(string: String): List<GalleryImageEntity> {
        val listType = object : TypeToken<List<GalleryImageEntity>>() {}.type
        return Gson().fromJson(string, listType)
    }

    @TypeConverter
    fun fromGalleryTagEntities(entities: List<GalleryTagEntity>): String {
        return Gson().toJson(entities)
    }

    @TypeConverter
    fun toGalleryTagEntities(string: String): List<GalleryTagEntity> {
        val listType = object : TypeToken<List<GalleryTagEntity>>() {}.type
        return Gson().fromJson(string, listType)
    }
}