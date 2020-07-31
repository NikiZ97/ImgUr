package com.nikiz.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.nikiz.data.network.model.Image
import com.nikiz.data.network.model.Tag

@Entity(tableName = GalleryEntity.TABLE_NAME)
class GalleryEntity(
    @ColumnInfo(name = "account_id")
    val accountId: Int?,
    @ColumnInfo(name = "account_url")
    val accountUrl: String?,
    @ColumnInfo(name = "ad_type")
    val adType: Int?,
    @ColumnInfo(name = "ad_url")
    val adUrl: String?,
    @ColumnInfo(name = "animated")
    val animated: Boolean?,
    @ColumnInfo(name = "bandwidth")
    val bandwidth: Long?,
    @ColumnInfo(name = "comment_count")
    val commentCount: Int?,
    @ColumnInfo(name = "cover")
    val cover: String?,
    @ColumnInfo(name = "cover_height")
    val coverHeight: Int?,
    @ColumnInfo(name = "cover_width")
    val cover_width: Int?,
    @ColumnInfo(name = "datetime")
    val datetime: Int?,
    @ColumnInfo(name = "description")
    val description: String?,
    @ColumnInfo(name = "downs")
    val downs: Int?,
    @ColumnInfo(name = "edited")
    val edited: Int?,
    @ColumnInfo(name = "favorite")
    val favorite: Boolean?,
    @ColumnInfo(name = "favorite_count")
    val favoriteCount: Int?,
    @ColumnInfo(name = "gifv")
    val gifv: String?,
    @ColumnInfo(name = "has_sound")
    val hasSound: Boolean?,
    @ColumnInfo(name = "height")
    val height: Int?,
    @ColumnInfo(name = "hls")
    val hls: String?,
    @ColumnInfo(name = "images")
    val images: List<GalleryImageEntity>?,
    @ColumnInfo(name = "images_count")
    val imagesCount: Int?,
    @ColumnInfo(name = "in_gallery")
    val inGallery: Boolean?,
    @ColumnInfo(name = "in_most_viral")
    val inMostViral: Boolean?,
    @ColumnInfo(name = "include_album_ads")
    val includeAlbumAds: Boolean?,
    @ColumnInfo(name = "is_ad")
    val isAd: Boolean?,
    @ColumnInfo(name = "is_album")
    val isAlbum: Boolean?,
    @ColumnInfo(name = "layout")
    val layout: String?,
    @ColumnInfo(name = "link")
    val link: String?,
    @ColumnInfo(name = "looping")
    val looping: Boolean?,
    @ColumnInfo(name = "mp4")
    val mp4: String?,
    @ColumnInfo(name = "mp4_size")
    val mp4Size: Int?,
    @ColumnInfo(name = "nsfw")
    val nsfw: Boolean?,
    @ColumnInfo(name = "points")
    val points: Int?,
    @ColumnInfo(name = "privacy")
    val privacy: String?,
    @ColumnInfo(name = "score")
    val score: Int?,
    @ColumnInfo(name = "section")
    val section: String?,
    @ColumnInfo(name = "size")
    val size: Int?,
    @ColumnInfo(name = "tags")
    val tags: List<GalleryTagEntity>?,
    @ColumnInfo(name = "title")
    val title: String?,
    @ColumnInfo(name = "topic")
    val topic: String?,
    @ColumnInfo(name = "topic_id")
    val topicId: Int?,
    @ColumnInfo(name = "type")
    val type: String?,
    @ColumnInfo(name = "ups")
    val ups: Int?,
    @ColumnInfo(name = "views")
    val views: Int?,
    @ColumnInfo(name = "vote")
    val vote: Boolean?,
    @ColumnInfo(name = "width")
    val width: Int?,
    @PrimaryKey
    @ColumnInfo(name = "id")
    val id: Long? = null
) {
    companion object {
        const val TABLE_NAME = "GalleryEntity"
    }
}