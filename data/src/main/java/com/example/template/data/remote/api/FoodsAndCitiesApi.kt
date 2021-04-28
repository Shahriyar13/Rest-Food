package com.example.template.data.remote.api

import com.example.template.data.remote.dto.response.FoodsAndCitiesResDTO
import retrofit2.Response
import retrofit2.http.GET

interface FoodsAndCitiesApi {

    @GET("7f18b4d273143f32399b")
    suspend fun getSamples(
    ): Response<FoodsAndCitiesResDTO>

}