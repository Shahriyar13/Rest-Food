package com.example.template.data.remote.dto.response

import com.google.gson.annotations.SerializedName

data class CityResDTO(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("description")
    val description: String,
)