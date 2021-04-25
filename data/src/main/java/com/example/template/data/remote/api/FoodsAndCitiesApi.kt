package com.example.template.data.remote.api

import com.example.template.data.remote.dto.response.FoodsAndCitiesResDTO
import retrofit2.Response
import retrofit2.http.GET

interface FoodsAndCitiesApi {

    @GET("a2b63ef226c08553b2f9")
    suspend fun getSamples(
    ): Response<FoodsAndCitiesResDTO>

}