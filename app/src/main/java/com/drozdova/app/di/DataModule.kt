package com.drozdova.app.di

import com.drozdova.app.data.ApiService
import com.drozdova.app.data.FilialsInfoRepoImpl
import com.drozdova.app.domain.repository.FilialsInfoRepo
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindFilialInfoRepository(repositoryImpl: FilialsInfoRepoImpl): FilialsInfoRepo

    companion object {
        private const val BASE_URL = "https://belarusbank.by/"

        @Provides
        fun provideApiService(retrofit: Retrofit) : ApiService{
            return retrofit.create(ApiService::class.java)
        }

        @Provides
        fun provideRetrofitInstance() : Retrofit{
            val httpClient = OkHttpClient.Builder()
                .callTimeout(2, TimeUnit.MINUTES)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(120, TimeUnit.SECONDS)
                .writeTimeout(30, TimeUnit.SECONDS);

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}