package com.example.template.data.datasource.cities

import com.example.template.data.datasource.BaseDataSource
import com.example.template.domain.entity.popular.CityEntity

interface CitiesLocalDataSource: BaseDataSource {
    suspend fun setCities(cityEntities: List<CityEntity>)
    suspend fun getCities(): List<CityEntity>
    suspend fun deleteAll()
    suspend fun getCity(id: Long): CityEntity?
}