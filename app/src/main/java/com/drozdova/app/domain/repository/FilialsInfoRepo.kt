package com.drozdova.app.domain.repository

import com.drozdova.app.presentation.model.FilialModel

interface FilialsInfoRepo {
    fun getDataList(): List<FilialModel>
}