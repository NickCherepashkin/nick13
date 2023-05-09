package com.drozdova.app.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.drozdova.app.data.FilialsInfoRepoImpl
import com.drozdova.app.domain.interactor.FilialsInfoInteractor
import com.drozdova.app.presentation.model.FilialModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FilialsInfoViewModel @Inject constructor(
    private val interactor: FilialsInfoInteractor
): ViewModel() {
    private val _dataList = MutableLiveData<List<FilialModel>>()
    val dataList : LiveData<List<FilialModel>> = _dataList

    private val _loading = MutableLiveData<Boolean>()
    val loading : LiveData<Boolean> = _loading

    fun showDataList(city: String) {
        viewModelScope.launch {
            _dataList.value = interactor.getDataList(city)
            _loading.value = false
        }
    }

    fun startLoading() {
        _loading.value = true
    }
}