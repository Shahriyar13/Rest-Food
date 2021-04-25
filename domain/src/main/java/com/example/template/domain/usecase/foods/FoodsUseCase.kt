package com.example.template.domain.usecase.foods

import com.example.template.domain.entity.popular.FoodEntity
import com.example.template.domain.usecase.BaseUseCase

interface FoodsUseCase: BaseUseCase {
    suspend fun getFoods(): List<FoodEntity>
}