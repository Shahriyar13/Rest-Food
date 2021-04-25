package com.example.template.data.locale

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.template.data.locale.dao.CityDao
import com.example.template.data.locale.dao.FoodDao
import com.example.template.data.locale.entity.CityData
import com.example.template.data.locale.entity.FoodData

@Database(
    entities = [
        CityData::class,
        FoodData::class,
    ],
    version = 1,
    exportSchema = false
)

@TypeConverters(TypeConverter::class)
abstract class MDatabase : RoomDatabase() {
    abstract fun cityDao(): CityDao
    abstract fun foodDao(): FoodDao
}