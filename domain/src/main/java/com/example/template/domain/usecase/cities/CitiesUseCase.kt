package com.example.template.domain.usecase.cities

import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.usecase.BaseUseCase

interface CitiesUseCase: BaseUseCase {
    suspend fun getCities(): List<CityEntity>
    suspend fun getCity(id: Long): CityEntity?
}