package com.example.template.di

import com.example.template.data.datasource.cities.CitiesLocalDataSource
import com.example.template.data.datasource.foods.FoodsLocalDataSource
import com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource
import com.example.template.data.repository.cities.CitiesRepositoryImpl
import com.example.template.data.repository.foods.FoodsRepositoryImpl
import com.example.template.data.repository.popular.UpdateListRepositoryImpl
import com.example.template.domain.repository.cities.CitiesRepository
import com.example.template.domain.repository.feature_a.UpdateListRepository
import com.example.template.domain.repository.foods.FoodsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class Repository {

    @Provides
    @Singleton
    fun provideSampleRepository(
        citiesLocalDataSource: CitiesLocalDataSource,
        foodsLocalDataSource: FoodsLocalDataSource,
        remoteDataSource: FoodsAndCitiesRemoteDataSource
    ): UpdateListRepository
    = UpdateListRepositoryImpl(citiesLocalDataSource, foodsLocalDataSource, remoteDataSource)

    @Provides
    @Singleton
    fun provideCitiesRepository(
        citiesLocalDataSource: CitiesLocalDataSource,
    ): CitiesRepository
    = CitiesRepositoryImpl(citiesLocalDataSource)

    @Provides
    @Singleton
    fun provideFoodsRepository(
        foodsLocalDataSource: FoodsLocalDataSource
    ): FoodsRepository
    = FoodsRepositoryImpl(foodsLocalDataSource)

}