package com.example.template.data.usecase.fetchdata

import com.example.template.domain.common.MResult
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.repository.feature_a.UpdateListRepository
import com.example.template.domain.usecase.fetchdata.UpdateListUseCase

class UpdateListUseCaseImpl(
    private val updateListRepository: UpdateListRepository
): UpdateListUseCase {

    override suspend fun updateCitiesAndFoods(): MResult<Boolean> {
        return updateListRepository.fetchFoodsAndCitiesData()
    }
}