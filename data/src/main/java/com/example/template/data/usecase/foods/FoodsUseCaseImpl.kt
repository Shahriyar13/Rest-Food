package com.example.template.data.usecase.foods

import com.example.template.domain.common.MResult
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.entity.popular.FoodEntity
import com.example.template.domain.repository.feature_a.UpdateListRepository
import com.example.template.domain.repository.foods.FoodsRepository
import com.example.template.domain.usecase.fetchdata.UpdateListUseCase
import com.example.template.domain.usecase.foods.FoodsUseCase

class FoodsUseCaseImpl(
    private val foodsRepository: FoodsRepository
): FoodsUseCase {

    override suspend fun getFoods(): List<FoodEntity> = foodsRepository.getFoods()
}