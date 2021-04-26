package com.example.template.data.datasource.cities

import com.example.template.data.locale.dao.CityDao
import com.example.template.data.mapper.foodandcity.map
import com.example.template.domain.entity.popular.CityEntity

class CitiesLocalDataSourceImpl(
    private val cityDao: CityDao,
): CitiesLocalDataSource {

    override suspend fun setCities(cityEntities: List<CityEntity>) {
        cityDao.insert(cityEntities.map { it.map() }.toList())
    }

    override suspend fun deleteAll() {
        cityDao.truncate()
    }

    override suspend fun getCity(id: Long): CityEntity? {
        return cityDao.selectById(id)?.map()
    }

    override suspend fun getCities(): List<CityEntity> {
        return cityDao.select()?.map { it.map() }?.toList() ?: listOf()
    }
}