package com.drozdova.app.domain.interactor

import com.drozdova.app.domain.repository.FilialsInfoRepo
import com.drozdova.app.presentation.model.FilialModel
import javax.inject.Inject

class FilialsInfoInteractor @Inject constructor(
    private val dataListRepo: FilialsInfoRepo
) {
    fun getDataList(): List<FilialModel> {
        return dataListRepo.getDataList()
    }
}