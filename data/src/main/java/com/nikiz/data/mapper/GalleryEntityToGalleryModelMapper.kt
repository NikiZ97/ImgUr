package com.nikiz.data.mapper

import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.local.entity.GalleryImageEntity
import com.nikiz.data.local.entity.GalleryTagEntity
import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.model.Image
import com.nikiz.domain.model.Tag

class GalleryEntityToGalleryModelMapper constructor() : Mapper<GalleryEntity, GalleryModel> {
    override fun map(model: GalleryEntity): GalleryModel {
        return GalleryModel(model.accountId, model.accountUrl, model.adType,
            model.adUrl, model.animated, model.bandwidth, model.commentCount, model.cover,
            model.coverHeight, model.cover_width, model.datetime, model.description,
            model.downs, model.edited, model.favorite, model.favoriteCount, model.gifv,
            model.hasSound, model.coverHeight, model.hls, model.gifv, getImages(model.images),
            model.imagesCount, model.inGallery, model.inMostViral, model.includeAlbumAds,
            model.isAd, model.isAlbum, model.layout, model.link, model.looping, model.mp4,
            model.mp4Size, model.nsfw, model.points, model.privacy, model.score, model.section,
            model.size, getTags(model.tags), model.title, model.topic, model.topicId, model.type,
            model.ups, model.views, model.vote, model.width
        )
    }

    private fun getImages(entityImages: List<GalleryImageEntity>): List<Image> {
        return entityImages.map { mapEntity(it) }
    }

    private fun mapEntity(it: GalleryImageEntity) =
        Image(it.accountId, it.accountUrl, it.adType, it.adUrl, it.animated, it.bandwidth,
            it.commentCount, it.datetime, it.description, it.downs, it.edited, it.favorite,
            it.favoriteCount, it.gifv, it.hasSound, it.height, it.hls, it.inGallery, it.inMostViral,
            it.isAd, it.link, it.looping, it.mp4, it.mp4Size, it.nsfw, it.points, it.score,
            it.section, it.mp4Size, getTags(it.tags), it.title, it.type, it.ups, it.views, it.vote,
            it.width)

    private fun getTags(tags: List<GalleryTagEntity>): List<Tag> {
        return tags.map { mapEntityTag(it) }
    }

    private fun mapEntityTag(it: GalleryTagEntity) =
        Tag(it.accent, it.backgroundHash, it.backgroundIsAnimated, it.description,
            it.displayName, it.followers, it.following, it.isPromoted, it.isWhitelisted,
            it.logoDestinationUrl, it.logoHash, it.name, it.thumbnailHash, it.thumbnailIsAnimated,
            it.totalItems)
}