package com.example.template.domain.repository.cities

import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.repository.BaseRepository

interface CitiesRepository: BaseRepository {
    suspend fun getCities() : List<CityEntity>
}