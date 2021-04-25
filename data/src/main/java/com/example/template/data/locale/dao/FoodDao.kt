package com.example.template.data.locale.dao

import androidx.room.Dao
import androidx.room.Query
import com.example.template.data.locale.entity.FoodData

@Dao
interface FoodDao: BaseDao<FoodData> {

    @Query("SELECT * FROM foodTable")
    suspend fun select(): List<FoodData>?

    @Query("SELECT * FROM foodTable WHERE name Like :name")
    suspend fun selectByName(name: String): List<FoodData>?

    @Query("SELECT * FROM foodTable WHERE id = :id")
    suspend fun selectById(id: Long): List<FoodData>?

    @Query("DELETE FROM foodTable")
    suspend fun truncate()
}