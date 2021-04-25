package com.example.template.domain.repository.feature_a

import com.example.template.domain.common.MResult
import com.example.template.domain.entity.popular.CityEntity
import com.example.template.domain.repository.BaseRepository

interface UpdateListRepository: BaseRepository {
    suspend fun fetchFoodsAndCitiesData() : MResult<Boolean>
}