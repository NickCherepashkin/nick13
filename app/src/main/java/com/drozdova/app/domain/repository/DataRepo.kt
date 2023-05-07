package com.drozdova.app.domain.repository

import com.drozdova.app.presentation.model.FilialModel

interface DataRepo {
    fun getDataList(): List<FilialModel>
}