package com.example.template.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class FoodsAndCitiesResDTO(
    @SerializedName("foods")
    val foods: List<FoodResDTO>,
    @SerializedName("cities")
    val cities: List<CityResDTO>,
)