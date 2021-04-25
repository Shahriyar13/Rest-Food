package com.example.template.di

import com.example.template.data.usecase.cities.CitiesUseCaseImpl
import com.example.template.data.usecase.fetchdata.UpdateListUseCaseImpl
import com.example.template.data.usecase.foods.FoodsUseCaseImpl
import com.example.template.domain.repository.cities.CitiesRepository
import com.example.template.domain.repository.feature_a.UpdateListRepository
import com.example.template.domain.repository.foods.FoodsRepository
import com.example.template.domain.usecase.cities.CitiesUseCase
import com.example.template.domain.usecase.fetchdata.UpdateListUseCase
import com.example.template.domain.usecase.foods.FoodsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {

    @Provides
    @Singleton
    fun provideUpdateListUseCase(
        updateListRepository: UpdateListRepository
    ): UpdateListUseCase = UpdateListUseCaseImpl(updateListRepository)

    @Provides
    @Singleton
    fun provideCitiesUseCase(
        citiesRepository: CitiesRepository
    ): CitiesUseCase = CitiesUseCaseImpl(citiesRepository)

    @Provides
    @Singleton
    fun provideFoodsUseCase(
        foodsRepository: FoodsRepository
    ): FoodsUseCase = FoodsUseCaseImpl(foodsRepository)

}