package com.example.template.data.repository.cities

import com.example.template.data.datasource.cities.CitiesLocalDataSource
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.repository.cities.CitiesRepository

class CitiesRepositoryImpl(
    private val localDataSource: CitiesLocalDataSource,
): CitiesRepository {

    override suspend fun getCities(): List<CityEntity> = localDataSource.getCities()

}