package com.example.template.domain.repository.foods

import com.example.template.domain.entity.popular.FoodEntity
import com.example.template.domain.repository.BaseRepository

interface FoodsRepository: BaseRepository {
    suspend fun getFoods() : List<FoodEntity>
}