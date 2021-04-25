package com.example.template.data.datasource.updatelist

import com.example.template.data.datasource.BaseDataSource
import com.example.template.data.remote.dto.response.FoodsAndCitiesResDTO
import com.example.template.domain.common.MResult

interface FoodsAndCitiesRemoteDataSource: BaseDataSource {
    suspend fun getFoodsAndCities(): MResult<FoodsAndCitiesResDTO>
}