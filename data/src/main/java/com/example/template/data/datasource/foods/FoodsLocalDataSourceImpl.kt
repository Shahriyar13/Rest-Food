package com.example.template.data.datasource.foods

import com.example.template.data.locale.dao.FoodDao
import com.example.template.data.mapper.foodandcity.map
import com.example.template.domain.entity.popular.FoodEntity

class FoodsLocalDataSourceImpl(
    private val foodDao: FoodDao,
): FoodsLocalDataSource {

    override suspend fun setFoods(foodEntities: List<FoodEntity>) {
        foodDao.insert(foodEntities.map { it.map() }.toList())
    }

    override suspend fun deleteAll() {
        foodDao.truncate()
    }

    override suspend fun getFoods(): List<FoodEntity> {
        return foodDao.select()?.map { it.map() }?.toList() ?: listOf()
    }
}