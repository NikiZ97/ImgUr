package com.nikiz.imgur.di.modules

import com.nikiz.data.local.dao.GalleryDao
import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.mapper.GalleryEntityToGalleryModelMapper
import com.nikiz.data.mapper.GalleryToGalleryEntityMapper
import com.nikiz.data.mapper.GalleryToGalleryModelMapper
import com.nikiz.data.mapper.Mapper
import com.nikiz.data.network.ImgurService
import com.nikiz.data.network.model.GalleryData
import com.nikiz.data.repository.GalleryDataRepositoryImp
import com.nikiz.data.repository.datasource.CloudGalleryDataSource
import com.nikiz.data.repository.datasource.GalleryDataStoreFactory
import com.nikiz.data.repository.datasource.GalleryDataStoreFactoryImp
import com.nikiz.data.repository.datasource.LocalGalleryDataSource
import com.nikiz.domain.model.GalleryModel
import com.nikiz.domain.repository.GalleryDataRepository
import com.nikiz.domain.usecase.GetDefaultGalleryUseCase
import com.nikiz.domain.usecase.GetDefaultGalleryUseCaseImp
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object GalleryModule {

    @Provides
    fun provideGalleryUseCase(galleryDataRepository: GalleryDataRepository): GetDefaultGalleryUseCase =
        GetDefaultGalleryUseCaseImp(galleryDataRepository)

    @Provides
    @Singleton
    fun provideGalleryRepository(galleryDataStoreFactory: GalleryDataStoreFactory): GalleryDataRepository =
        GalleryDataRepositoryImp(galleryDataStoreFactory)

    @Provides
    @Singleton
    fun provideGalleryDataStoreFactory(cloudGalleryDataSource: CloudGalleryDataSource,
                                       localGalleryDataSource: LocalGalleryDataSource): GalleryDataStoreFactory =
        GalleryDataStoreFactoryImp(cloudGalleryDataSource, localGalleryDataSource)

    @Provides
    @Singleton
    fun provideCloudGalleryDataSource(imgurService: ImgurService,
                                      galleryDao: GalleryDao,
                                      galleryToGalleryEntityMapper: GalleryToGalleryEntityMapper,
                                      galleryToGalleryModelMapper: GalleryToGalleryModelMapper): CloudGalleryDataSource =
        CloudGalleryDataSource(imgurService, galleryDao, galleryToGalleryEntityMapper, galleryToGalleryModelMapper)

    @Provides
    @Singleton
    fun provideLocalGalleryDataSource(galleryDao: GalleryDao,
                                      galleryEntityToGalleryModelMapper: GalleryEntityToGalleryModelMapper): LocalGalleryDataSource =
        LocalGalleryDataSource(galleryDao, galleryEntityToGalleryModelMapper)

    @Provides
    @Singleton
    fun provideGalleryToGalleryModelMapper(): GalleryToGalleryModelMapper {
        return GalleryToGalleryModelMapper()
    }

    @Provides
    @Singleton
    fun provideGalleryToGalleryEntityMapper(): GalleryToGalleryEntityMapper {
        return GalleryToGalleryEntityMapper()
    }

    @Provides
    @Singleton
    fun provideGalleryEntityToGalleryModelMapper(): GalleryEntityToGalleryModelMapper {
        return GalleryEntityToGalleryModelMapper()
    }

}