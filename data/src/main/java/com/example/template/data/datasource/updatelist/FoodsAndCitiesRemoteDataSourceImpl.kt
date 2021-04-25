package com.example.template.data.datasource.updatelist

import com.example.template.data.common.Converter
import com.example.template.data.remote.api.FoodsAndCitiesApi
import com.example.template.data.remote.dto.response.FoodsAndCitiesResDTO
import com.example.template.domain.common.MResult

class FoodsAndCitiesRemoteDataSourceImpl(
    private val foodsAndCitiesApi: FoodsAndCitiesApi
): FoodsAndCitiesRemoteDataSource {

    override suspend fun getFoodsAndCities(): MResult<FoodsAndCitiesResDTO> {
        val res = foodsAndCitiesApi.getSamples()
        return when (val result =
            Converter.createFromResponse(res)) {
            is MResult.Success -> {
                MResult.Success(result.data)
            }
            is MResult.SuccessEmpty -> MResult.SuccessEmpty()
            is MResult.Error -> MResult.Error(result.errorMessage)
            else -> MResult.Error("Unknown")
        }
    }

}