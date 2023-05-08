package com.drozdova.app.data

import com.drozdova.app.data.model.FilialInfo
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/api/kursExchange")
    suspend fun getAllFilialsInfo(@Query("city") city: String) : Response<List<FilialInfo>>
}