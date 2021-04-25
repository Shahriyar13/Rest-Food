package com.example.template.domain.entity.popular

import java.io.Serializable

data class FoodEntity(
    val id : Long? = 0,
    val name : String?,
    val imageUrl: String?
): Serializable