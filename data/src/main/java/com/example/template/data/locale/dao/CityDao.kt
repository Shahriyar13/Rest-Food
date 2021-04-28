package com.example.template.data.locale.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.template.data.locale.entity.CityData

@Dao
interface CityDao: BaseDao<CityData> {

    @Query("SELECT * FROM CityTable")
    suspend fun select(): List<CityData>?

    @Query("SELECT * FROM CityTable WHERE name Like :name")
    suspend fun selectByName(name: String): List<CityData>?

    @Query("SELECT * FROM CityTable WHERE id = :id LIMIT 1")
    suspend fun selectById(id: Long): CityData?

    @Query("DELETE FROM CityTable")
    suspend fun truncate()
}