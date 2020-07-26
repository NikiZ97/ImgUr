package com.nikiz.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.nikiz.data.network.model.Tag

@Entity(tableName = GalleryImageEntity.TABLE_NAME)
class GalleryImageEntity(
    @ColumnInfo(name = "account_id")
    val accountId: Int,
    @ColumnInfo(name = "account_url")
    val accountUrl: String,
    @ColumnInfo(name = "ad_type")
    val adType: Int,
    @ColumnInfo(name = "ad_url")
    val adUrl: String,
    @ColumnInfo(name = "animated")
    val animated: Boolean,
    @ColumnInfo(name = "bandwidth")
    val bandwidth: Long,
    @ColumnInfo(name = "comment_count")
    val commentCount: Int,
    @ColumnInfo(name = "datetime")
    val datetime: Int,
    @ColumnInfo(name = "description")
    val description: String,
    @ColumnInfo(name = "downs")
    val downs: Int,
    @ColumnInfo(name = "edited")
    val edited: String,
    @ColumnInfo(name = "favorite")
    val favorite: Boolean,
    @ColumnInfo(name = "favorite_count")
    val favoriteCount: Int,
    @ColumnInfo(name = "gifv")
    val gifv: String,
    @ColumnInfo(name = "has_sound")
    val hasSound: Boolean,
    @ColumnInfo(name = "height")
    val height: Int,
    @ColumnInfo(name = "hls")
    val hls: String,
    @ColumnInfo(name = "in_gallery")
    val inGallery: Boolean,
    @ColumnInfo(name = "in_most_viral")
    val inMostViral: Boolean,
    @ColumnInfo(name = "is_ad")
    val isAd: Boolean,
    @ColumnInfo(name = "link")
    val link: String,
    @ColumnInfo(name = "looping")
    val looping: Boolean,
    @ColumnInfo(name = "mp4")
    val mp4: String,
    @ColumnInfo(name = "mp4_size")
    val mp4Size: Int,
    @ColumnInfo(name = "nsfw")
    val nsfw: Boolean,
    @ColumnInfo(name = "points")
    val points: Int,
    @ColumnInfo(name = "score")
    val score: Int,
    @ColumnInfo(name = "section")
    val section: String,
    @ColumnInfo(name = "size")
    val size: Int,
    @ColumnInfo(name = "tags")
    val tags: List<GalleryTagEntity>,
    @ColumnInfo(name = "title")
    val title: String,
    @ColumnInfo(name = "type")
    val type: String,
    @ColumnInfo(name = "ups")
    val ups: Int,
    @ColumnInfo(name = "views")
    val views: Int,
    @ColumnInfo(name = "vote")
    val vote: Boolean,
    @ColumnInfo(name = "width")
    val width: Int,
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Long? = null
) {
    companion object {
        const val TABLE_NAME = "GalleryImage"
    }
}