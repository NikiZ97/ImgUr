package com.nikiz.data.network.model

import com.google.gson.annotations.SerializedName


data class Gallery(
    @SerializedName("data")
    val galleryData: List<GalleryData>?,
    @SerializedName("status")
    val status: Int,
    @SerializedName("success")
    val success: Boolean
)

data class GalleryData(
    @SerializedName("account_id")
    val accountId: Int?,
    @SerializedName("account_url")
    val accountUrl: String?,
    @SerializedName("ad_type")
    val adType: Int?,
    @SerializedName("ad_url")
    val adUrl: String?,
    @SerializedName("animated")
    val animated: Boolean?,
    @SerializedName("bandwidth")
    val bandwidth: Long?,
    @SerializedName("comment_count")
    val commentCount: Int?,
    @SerializedName("cover")
    val cover: String?,
    @SerializedName("cover_height")
    val coverHeight: Int?,
    @SerializedName("cover_width")
    val cover_width: Int?,
    @SerializedName("datetime")
    val datetime: Int?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("downs")
    val downs: Int?,
    @SerializedName("edited")
    val edited: Int?,
    @SerializedName("favorite")
    val favorite: Boolean?,
    @SerializedName("favorite_count")
    val favoriteCount: Int?,
    @SerializedName("gifv")
    val gifv: String?,
    @SerializedName("has_sound")
    val hasSound: Boolean?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("hls")
    val hls: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("images")
    val images: List<Image>?,
    @SerializedName("images_count")
    val imagesCount: Int?,
    @SerializedName("in_gallery")
    val inGallery: Boolean?,
    @SerializedName("in_most_viral")
    val inMostViral: Boolean?,
    @SerializedName("include_album_ads")
    val includeAlbumAds: Boolean?,
    @SerializedName("is_ad")
    val isAd: Boolean?,
    @SerializedName("is_album")
    val isAlbum: Boolean?,
    @SerializedName("layout")
    val layout: String?,
    @SerializedName("link")
    val link: String?,
    @SerializedName("looping")
    val looping: Boolean?,
    @SerializedName("mp4")
    val mp4: String?,
    @SerializedName("mp4_size")
    val mp4Size: Int?,
    @SerializedName("nsfw")
    val nsfw: Boolean?,
    @SerializedName("points")
    val points: Int?,
    @SerializedName("privacy")
    val privacy: String?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("section")
    val section: String?,
    @SerializedName("size")
    val size: Int?,
    @SerializedName("tags")
    val tags: List<Tag>?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("topic")
    val topic: String?,
    @SerializedName("topic_id")
    val topicId: Int?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("ups")
    val ups: Int?,
    @SerializedName("views")
    val views: Int?,
    @SerializedName("vote")
    val vote: Boolean?,
    @SerializedName("width")
    val width: Int?
)

data class Image(
    @SerializedName("account_id")
    val accountId: Int?,
    @SerializedName("account_url")
    val accountUrl: String?,
    @SerializedName("ad_type")
    val adType: Int?,
    @SerializedName("ad_url")
    val adUrl: String?,
    @SerializedName("animated")
    val animated: Boolean?,
    @SerializedName("bandwidth")
    val bandwidth: Long?,
    @SerializedName("comment_count")
    val commentCount: Int?,
    @SerializedName("datetime")
    val datetime: Int?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("downs")
    val downs: Int?,
    @SerializedName("edited")
    val edited: String?,
    @SerializedName("favorite")
    val favorite: Boolean?,
    @SerializedName("favorite_count")
    val favoriteCount: Int?,
    @SerializedName("gifv")
    val gifv: String?,
    @SerializedName("has_sound")
    val hasSound: Boolean?,
    @SerializedName("height")
    val height: Int?,
    @SerializedName("hls")
    val hls: String?,
    @SerializedName("in_gallery")
    val inGallery: Boolean?,
    @SerializedName("in_most_viral")
    val inMostViral: Boolean?,
    @SerializedName("is_ad")
    val isAd: Boolean?,
    @SerializedName("link")
    val link: String?,
    @SerializedName("looping")
    val looping: Boolean?,
    @SerializedName("mp4")
    val mp4: String?,
    @SerializedName("mp4_size")
    val mp4Size: Int?,
    @SerializedName("nsfw")
    val nsfw: Boolean?,
    @SerializedName("points")
    val points: Int?,
    @SerializedName("score")
    val score: Int?,
    @SerializedName("section")
    val section: String?,
    @SerializedName("size")
    val size: Int?,
    @SerializedName("tags")
    val tags: List<Tag>?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("type")
    val type: String?,
    @SerializedName("ups")
    val ups: Int?,
    @SerializedName("views")
    val views: Int?,
    @SerializedName("vote")
    val vote: Boolean?,
    @SerializedName("width")
    val width: Int?
)

data class Tag(
    @SerializedName("accent")
    val accent: String?,
    @SerializedName("background_hash")
    val backgroundHash: String?,
    @SerializedName("background_is_animated")
    val backgroundIsAnimated: Boolean?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("display_name")
    val displayName: String?,
    @SerializedName("followers")
    val followers: Int?,
    @SerializedName("following")
    val following: Boolean?,
    @SerializedName("is_promoted")
    val isPromoted: Boolean?,
    @SerializedName("is_whitelisted")
    val isWhitelisted: Boolean?,
    @SerializedName("logo_destination_url")
    val logoDestinationUrl: String?,
    @SerializedName("logo_hash")
    val logoHash: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("thumbnail_hash")
    val thumbnailHash: String?,
    @SerializedName("thumbnail_is_animated")
    val thumbnailIsAnimated: Boolean?,
    @SerializedName("total_items")
    val totalItems: Int?
)