package com.example.template.data.repository.foods

import com.example.template.data.datasource.foods.FoodsLocalDataSource
import com.example.template.domain.entity.popular.FoodEntity
import com.example.template.domain.repository.foods.FoodsRepository

class FoodsRepositoryImpl(
    private val localDataSource: FoodsLocalDataSource,
): FoodsRepository {

    override suspend fun getFoods(): List<FoodEntity> = localDataSource.getFoods()
}