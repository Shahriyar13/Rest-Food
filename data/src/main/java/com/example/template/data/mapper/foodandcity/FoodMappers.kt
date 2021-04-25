package com.example.template.data.mapper.foodandcity

import com.example.template.data.locale.entity.FoodData
import com.example.template.data.remote.dto.response.FoodResDTO
import com.example.template.domain.entity.popular.FoodEntity

fun FoodEntity.map() = FoodData(
    name = name ?: "",
    imageUrl = imageUrl ?: "",
)
fun FoodData.map() = FoodEntity(
    id = id,
    name = name,
    imageUrl = imageUrl,
)
fun FoodResDTO.map() = FoodEntity(
    name = name,
    imageUrl = image,
)