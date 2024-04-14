package com.example.cats.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import com.example.cats.domain.repositories.CatFactRepository
import com.example.cats.domain.usecases.GetCatRandomFactUseCase
import com.example.cats.domain.usecases.GetCatRandomFactUseCaseImpl


@Module
@InstallIn(ActivityRetainedComponent::class)
class UseCaseModule {

    @Provides
    fun provideGetCatRandomFact(
        catFactRepository: CatFactRepository
    ): GetCatRandomFactUseCase = GetCatRandomFactUseCaseImpl(catFactRepository)
}