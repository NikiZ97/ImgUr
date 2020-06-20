package com.nikiz.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = GalleryTagEntity.TABLE_NAME)
class GalleryTagEntity(
    @ColumnInfo(name = "accent")
    val accent: String,
    @ColumnInfo(name = "background_hash")
    val backgroundHash: String,
    @ColumnInfo(name = "background_is_animated")
    val backgroundIsAnimated: Boolean,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "display_name")
    val displayName: String,
    @ColumnInfo(name = "followers")
    val followers: Int,
    @ColumnInfo(name = "following")
    val following: Boolean,
    @ColumnInfo(name = "is_promoted")
    val isPromoted: Boolean,
    @ColumnInfo(name = "is_whitelisted")
    val isWhitelisted: Boolean,
    @ColumnInfo(name = "logo_destination_url")
    val logoDestinationUrl: String,
    @ColumnInfo(name = "logo_hash")
    val logoHash: String,
    @ColumnInfo(name = "name")
    val name: String,
    @ColumnInfo(name = "thumbnail_hash")
    val thumbnailHash: String,
    @ColumnInfo(name = "thumbnail_is_animated")
    val thumbnailIsAnimated: Boolean,
    @ColumnInfo(name = "total_items")
    val totalItems: Int,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long? = null
) {
    companion object {
        const val TABLE_NAME = "GalleryTag"
    }
}