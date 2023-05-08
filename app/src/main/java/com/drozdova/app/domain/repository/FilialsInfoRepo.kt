package com.drozdova.app.domain.repository

import com.drozdova.app.presentation.model.FilialModel

interface FilialsInfoRepo {
    suspend fun getDataList(city: String): List<FilialModel>
}