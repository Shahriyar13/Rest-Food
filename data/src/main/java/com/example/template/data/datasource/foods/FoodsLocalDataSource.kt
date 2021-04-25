package com.example.template.data.datasource.foods

import com.example.template.data.datasource.BaseDataSource
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.entity.popular.FoodEntity

interface FoodsLocalDataSource: BaseDataSource {
    suspend fun setFoods(foodEntities: List<FoodEntity>)
    suspend fun getFoods(): List<FoodEntity>
    suspend fun deleteAll()
}