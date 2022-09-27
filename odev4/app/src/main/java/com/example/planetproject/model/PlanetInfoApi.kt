package com.example.planetproject.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface PlanetInfoApi {

    @GET("realestate")
    fun planet():Call<PlaneInfoItem>
}


