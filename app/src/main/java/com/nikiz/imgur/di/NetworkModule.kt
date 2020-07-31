package com.nikiz.imgur.di

import com.google.gson.Gson
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.nikiz.data.local.entity.GalleryEntity
import com.nikiz.data.mapper.GalleryEntityToGalleryModelMapper
import com.nikiz.data.mapper.GalleryToGalleryEntityMapper
import com.nikiz.data.mapper.GalleryToGalleryModelMapper
import com.nikiz.data.mapper.Mapper
import com.nikiz.data.network.ImgurService
import com.nikiz.data.network.interceptor.ClientIdHeaderInterceptor
import com.nikiz.data.network.model.GalleryData
import com.nikiz.domain.model.GalleryModel
import com.nikiz.imgur.BuildConfig
import com.nikiz.imgur.utils.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideGsonBuilder() = Gson()

    @Provides
    @Singleton
    fun provideRetrofit(gson: Gson, client: OkHttpClient): Retrofit.Builder {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(httpLoggingInterceptor: HttpLoggingInterceptor,
                            clientIdHeaderInterceptor: ClientIdHeaderInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .addInterceptor(clientIdHeaderInterceptor)
            .build()
    }

    @Provides
    @Singleton
    fun provideClientIdHeaderInterceptor(): ClientIdHeaderInterceptor {
        return ClientIdHeaderInterceptor(BuildConfig.API_CLIENT_ID)
    }

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }

    @Provides
    @Singleton
    fun provideImgurService(builder: Retrofit.Builder): ImgurService {
        return builder.build().create(ImgurService::class.java)
    }
}