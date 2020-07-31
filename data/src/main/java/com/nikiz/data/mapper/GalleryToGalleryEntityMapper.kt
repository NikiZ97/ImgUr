package com.nikiz.data.mapper

import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.local.entity.GalleryImageEntity
import com.nikiz.data.local.entity.GalleryTagEntity
import com.nikiz.data.network.model.GalleryData

typealias NetworkImages = List<com.nikiz.data.network.model.Image>
typealias NetworkImage = com.nikiz.data.network.model.Image
typealias NetworkTag = com.nikiz.data.network.model.Tag
typealias NetworkTags = List<com.nikiz.data.network.model.Tag>

class GalleryToGalleryEntityMapper : Mapper<GalleryData, GalleryEntity> {
    override fun map(model: GalleryData): GalleryEntity {
        return GalleryEntity(model.accountId, model.accountUrl, model.adType,
            model.adUrl, model.animated, model.bandwidth, model.commentCount, model.cover,
            model.coverHeight, model.cover_width, model.datetime, model.description,
            model.downs, model.edited, model.favorite, model.favoriteCount, model.gifv,
            model.hasSound, model.coverHeight, model.hls, getImages(model.images),
            model.imagesCount, model.inGallery, model.inMostViral, model.includeAlbumAds,
            model.isAd, model.isAlbum, model.layout, model.link, model.looping, model.mp4,
            model.mp4Size, model.nsfw, model.points, model.privacy, model.score, model.section,
            model.size, getTags(model.tags), model.title, model.topic, model.topicId, model.type,
            model.ups, model.views, model.vote, model.width
        )
    }

    private fun getImages(entityImages: NetworkImages?): List<GalleryImageEntity>? {
        return entityImages?.map { mapEntity(it) }
    }

    private fun mapEntity(it: NetworkImage) =
        GalleryImageEntity(it.accountId, it.accountUrl, it.adType, it.adUrl, it.animated, it.bandwidth,
            it.commentCount, it.datetime, it.description, it.downs, it.edited, it.favorite,
            it.favoriteCount, it.gifv, it.hasSound, it.height, it.hls, it.inGallery, it.inMostViral,
            it.isAd, it.link, it.looping, it.mp4, it.mp4Size, it.nsfw, it.points, it.score,
            it.section, it.mp4Size, getTags(it.tags), it.title, it.type, it.ups, it.views, it.vote,
            it.width)

    private fun getTags(tags: NetworkTags?): List<GalleryTagEntity>? {
        return tags?.map { mapEntityTag(it) }
    }

    private fun mapEntityTag(it: NetworkTag) =
        GalleryTagEntity(it.accent, it.backgroundHash, it.backgroundIsAnimated, it.description,
            it.displayName, it.followers, it.following, it.isPromoted, it.isWhitelisted,
            it.logoDestinationUrl, it.logoHash, it.name, it.thumbnailHash, it.thumbnailIsAnimated,
            it.totalItems)

}