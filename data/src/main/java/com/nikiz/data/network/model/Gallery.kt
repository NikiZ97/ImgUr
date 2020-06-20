package com.nikiz.data.network.model

import com.google.gson.annotations.SerializedName


data class Gallery(
    @SerializedName("data")
    val galleryData: List<GalleryData>,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)

data class GalleryData(
    @SerializedName("account_id")
    val accountId: Int,
    @SerializedName("account_url")
    val accountUrl: String,
    @SerializedName("ad_type")
    val adType: Int,
    @SerializedName("ad_url")
    val adUrl: String,
    @SerializedName("animated")
    val animated: Boolean,
    @SerializedName("bandwidth")
    val bandwidth: Long,
    @SerializedName("comment_count")
    val commentCount: Int,
    @SerializedName("cover")
    val cover: String,
    @SerializedName("cover_height")
    val coverHeight: Int,
    @SerializedName("cover_width")
    val cover_width: Int,
    @SerializedName("datetime")
    val datetime: Int,
    @SerializedName("description")
    val description: Any,
    @SerializedName("downs")
    val downs: Int,
    @SerializedName("edited")
    val edited: Int,
    @SerializedName("favorite")
    val favorite: Boolean,
    @SerializedName("favorite_count")
    val favoriteCount: Int,
    @SerializedName("gifv")
    val gifv: String,
    @SerializedName("has_sound")
    val hasSound: Boolean,
    @SerializedName("height")
    val height: Int,
    @SerializedName("hls")
    val hls: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("images")
    val images: List<Image>,
    @SerializedName("images_count")
    val imagesCount: Int,
    @SerializedName("in_gallery")
    val inGallery: Boolean,
    @SerializedName("in_most_viral")
    val inMostViral: Boolean,
    @SerializedName("include_album_ads")
    val includeAlbumAds: Boolean,
    @SerializedName("is_ad")
    val isAd: Boolean,
    @SerializedName("is_album")
    val isAlbum: Boolean,
    @SerializedName("layout")
    val layout: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("looping")
    val looping: Boolean,
    @SerializedName("mp4")
    val mp4: String,
    @SerializedName("mp4_size")
    val mp4_size: Int,
    @SerializedName("nsfw")
    val nsfw: Boolean,
    @SerializedName("points")
    val points: Int,
    @SerializedName("privacy")
    val privacy: String,
    @SerializedName("score")
    val score: Int,
    @SerializedName("section")
    val section: String,
    @SerializedName("size")
    val size: Int,
    @SerializedName("tags")
    val tags: List<Tag>,
    @SerializedName("title")
    val title: String,
    @SerializedName("topic")
    val topic: String,
    @SerializedName("topic_id")
    val topic_id: Int,
    @SerializedName("type")
    val type: String,
    @SerializedName("ups")
    val ups: Int,
    @SerializedName("views")
    val views: Int,
    @SerializedName("vote")
    val vote: Any,
    @SerializedName("width")
    val width: Int
)

data class Image(
    @SerializedName("account_id")
    val account_id: Any,
    @SerializedName("account_url")
    val account_url: Any,
    @SerializedName("ad_type")
    val ad_type: Int,
    @SerializedName("ad_url")
    val ad_url: String,
    @SerializedName("animated")
    val animated: Boolean,
    @SerializedName("bandwidth")
    val bandwidth: Long,
    @SerializedName("comment_count")
    val comment_count: Any,
    @SerializedName("datetime")
    val datetime: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("downs")
    val downs: Any,
    @SerializedName("edited")
    val edited: String,
    @SerializedName("favorite")
    val favorite: Boolean,
    @SerializedName("favorite_count")
    val favorite_count: Any,
    @SerializedName("gifv")
    val gifv: String,
    @SerializedName("has_sound")
    val has_sound: Boolean,
    @SerializedName("height")
    val height: Int,
    @SerializedName("hls")
    val hls: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("in_gallery")
    val in_gallery: Boolean,
    @SerializedName("in_most_viral")
    val in_most_viral: Boolean,
    @SerializedName("is_ad")
    val is_ad: Boolean,
    @SerializedName("link")
    val link: String,
    @SerializedName("looping")
    val looping: Boolean,
    @SerializedName("mp4")
    val mp4: String,
    @SerializedName("mp4_size")
    val mp4_size: Int,
    @SerializedName("nsfw")
    val nsfw: Any,
    @SerializedName("points")
    val points: Any,
    @SerializedName("score")
    val score: Any,
    @SerializedName("section")
    val section: Any,
    @SerializedName("size")
    val size: Int,
    @SerializedName("tags")
    val tags: List<Tag>,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("ups")
    val ups: Int,
    @SerializedName("views")
    val views: Int,
    @SerializedName("vote")
    val vote: Any,
    @SerializedName("width")
    val width: Int
)

data class Tag(
    @SerializedName("accent")
    val accent: String,
    @SerializedName("background_hash")
    val background_hash: String,
    @SerializedName("background_is_animated")
    val background_is_animated: Boolean,
    @SerializedName("description")
    val description: String,
    @SerializedName("display_name")
    val display_name: String,
    @SerializedName("followers")
    val followers: Int,
    @SerializedName("following")
    val following: Boolean,
    @SerializedName("is_promoted")
    val is_promoted: Boolean,
    @SerializedName("is_whitelisted")
    val is_whitelisted: Boolean,
    @SerializedName("logo_destination_url")
    val logo_destination_url: Any,
    @SerializedName("logo_hash")
    val logo_hash: Any,
    @SerializedName("name")
    val name: String,
    @SerializedName("thumbnail_hash")
    val thumbnail_hash: Any,
    @SerializedName("thumbnail_is_animated")
    val thumbnail_is_animated: Boolean,
    @SerializedName("total_items")
    val total_items: Int
)