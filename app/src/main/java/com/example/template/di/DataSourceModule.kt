package com.example.template.di

import com.example.template.data.datasource.cities.CitiesLocalDataSource
import com.example.template.data.datasource.cities.CitiesLocalDataSourceImpl
import com.example.template.data.datasource.foods.FoodsLocalDataSource
import com.example.template.data.datasource.foods.FoodsLocalDataSourceImpl
import com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource
import com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSourceImpl
import com.example.template.data.locale.dao.CityDao
import com.example.template.data.locale.dao.FoodDao
import com.example.template.data.remote.api.FoodsAndCitiesApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {

    @Provides
    @Singleton
    fun provideCityLocalDataSource(cityDao: CityDao): CitiesLocalDataSource =
        CitiesLocalDataSourceImpl(cityDao)

    @Provides
    @Singleton
    fun provideFoodLocalDataSource(foodDao: FoodDao): FoodsLocalDataSource =
        FoodsLocalDataSourceImpl(foodDao)

    @Provides
    @Singleton
    fun provideSampleRemoteDataSource(foodsAndCitiesApi: FoodsAndCitiesApi): FoodsAndCitiesRemoteDataSource =
        FoodsAndCitiesRemoteDataSourceImpl(foodsAndCitiesApi)

}