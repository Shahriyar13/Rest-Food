package com.example.template.data.usecase.cities

import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.repository.cities.CitiesRepository
import com.example.template.domain.usecase.cities.CitiesUseCase

class CitiesUseCaseImpl(
    private val citiesRepository: CitiesRepository
): CitiesUseCase {

    override suspend fun getCities(): List<CityEntity> = citiesRepository.getCities()
}