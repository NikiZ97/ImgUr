package com.nikiz.data.mapper

import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.network.model.Gallery

class GalleryToGalleryEntityMapper : Mapper<Gallery, GalleryEntity> {
    override fun map(a: Gallery): GalleryEntity {
        return GalleryEntity()
    }

}