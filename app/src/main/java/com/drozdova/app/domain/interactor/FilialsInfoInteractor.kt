package com.drozdova.app.domain.interactor

import com.drozdova.app.domain.repository.FilialsInfoRepo
import com.drozdova.app.presentation.model.FilialModel

class FilialsInfoInteractor(
    private val dataListRepo: FilialsInfoRepo
) {
    fun getDataList(): List<FilialModel> {
        return dataListRepo.getDataList()
    }
}