package com.example.template.data.locale.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "CityTable"
)
data class CityData(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val imageUrl: String,
    val description: String,
)