package com.example.template.data.mapper.foodandcity

import com.example.template.data.locale.entity.CityData
import com.example.template.data.remote.dto.response.CityResDTO
import com.example.template.domain.entity.popular.CityEntity

fun CityEntity.map() = CityData(
    name = name ?: "",
    imageUrl = imageUrl ?: "",
    description = description ?: ""
)
fun CityData.map() = CityEntity(
    id = id,
    name = name,
    imageUrl = imageUrl,
    description = description
)
fun CityResDTO.map() = CityEntity(
    name = name,
    imageUrl = image,
    description = description
)