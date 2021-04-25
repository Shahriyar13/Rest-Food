package com.example.template.data.repository.popular

import com.example.template.data.common.NetworkUtils
import com.example.template.data.datasource.cities.CitiesLocalDataSource
import com.example.template.data.datasource.foods.FoodsLocalDataSource
import com.example.template.data.datasource.updatelist.FoodsAndCitiesRemoteDataSource
import com.example.template.data.mapper.foodandcity.map
import com.example.template.domain.common.MResult
import com.example.template.domain.repository.feature_a.UpdateListRepository

class UpdateListRepositoryImpl(
    private val citiesLocalDataSource: CitiesLocalDataSource,
    private val foodsLocalDataSource: FoodsLocalDataSource,
    private val remoteDataSource: FoodsAndCitiesRemoteDataSource
): UpdateListRepository {

    override suspend fun fetchFoodsAndCitiesData(): MResult<Boolean> {
        if (NetworkUtils.isOnline()) {
            val res = remoteDataSource.getFoodsAndCities()
            if (res is MResult.Success) {
                if (res.data != null) {
                    if (res.data?.cities.isNullOrEmpty().not()) {
                        citiesLocalDataSource.deleteAll()
                        citiesLocalDataSource.setCities(
                            res.data?.cities?.map { it.map() }?.toList() ?: listOf()
                        )
                    }
                    if (res.data?.foods.isNullOrEmpty().not()) {
                        foodsLocalDataSource.deleteAll()
                        foodsLocalDataSource.setFoods(
                            res.data?.foods?.map { it.map() }?.toList() ?: listOf()
                        )
                    }
                    return MResult.Success(true)
                }
            }
            return MResult.Error("Error")
        }
        return MResult.Error("No Internet")
    }
}