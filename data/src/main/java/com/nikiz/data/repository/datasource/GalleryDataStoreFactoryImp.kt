package com.nikiz.data.repository.datasource

class GalleryDataStoreFactoryImp(private val cloudGalleryDataSource: CloudGalleryDataSource,
                                 private val localGalleryDataSource: LocalGalleryDataSource) :
    GalleryDataStoreFactory {

    override fun create(priority: GalleryDataStoreFactory.Priority): GalleryDataStore {
        return if (priority == GalleryDataStoreFactory.Priority.CLOUD) {
            cloudGalleryDataSource
        } else {
            localGalleryDataSource
        }
    }
}

interface GalleryDataStoreFactory {
    enum class Priority {
        CLOUD, CACHE
    }

    fun create(priority: Priority): GalleryDataStore
}