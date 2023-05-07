package com.drozdova.app.domain.interactor

import com.drozdova.app.domain.repository.DataRepo
import com.drozdova.app.presentation.model.FilialModel

class DataInteractor(
    private val dataListRepo: DataRepo
) {
    fun getDataList(): List<FilialModel> {
        return dataListRepo.getDataList()
    }
}