package com.drozdova.app.di

import com.drozdova.app.data.FilialsInfoRepoImpl
import com.drozdova.app.domain.repository.FilialsInfoRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindFilialInfoRepository(repositoryImpl: FilialsInfoRepoImpl): FilialsInfoRepo
}