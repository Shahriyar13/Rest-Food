package com.example.template.data.locale.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "FoodTable"
)
data class FoodData(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val name: String,
    val imageUrl: String,
)