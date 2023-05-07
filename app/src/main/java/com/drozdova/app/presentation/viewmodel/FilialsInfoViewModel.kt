package com.drozdova.app.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.drozdova.app.data.FilialsInfoRepoImpl
import com.drozdova.app.domain.interactor.FilialsInfoInteractor
import com.drozdova.app.presentation.model.FilialModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FilialsInfoViewModel @Inject constructor(
    private val interactor: FilialsInfoInteractor
): ViewModel() {
    private val _dataList = MutableLiveData<List<FilialModel>>()
    val dataList : LiveData<List<FilialModel>> = _dataList

    fun showDataList() {
        _dataList.value = interactor.getDataList()
    }
}