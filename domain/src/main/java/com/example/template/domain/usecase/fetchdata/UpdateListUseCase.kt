package com.example.template.domain.usecase.fetchdata

import com.example.template.domain.common.MResult
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.usecase.BaseUseCase

interface UpdateListUseCase: BaseUseCase {
    suspend fun updateCitiesAndFoods(): MResult<Boolean>
}