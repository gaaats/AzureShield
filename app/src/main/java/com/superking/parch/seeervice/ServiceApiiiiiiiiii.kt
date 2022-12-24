package com.superking.parch.seeervice

import retrofit2.Response
import retrofit2.http.GET

interface ServiceApi {

    @GET("json/?key=KXgMIA7HSEcn0SV")
    suspend fun getDataaaaaa(): Response<CountryCodeJS>

    @GET("const.json")
    suspend fun getDataDevvvvvv(): Response<GeoDev>
}

