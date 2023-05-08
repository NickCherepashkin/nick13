package com.drozdova.app.data

import com.drozdova.app.domain.repository.FilialsInfoRepo
import com.drozdova.app.presentation.model.CurrencyModel
import com.drozdova.app.presentation.model.FilialModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class FilialsInfoRepoImpl @Inject constructor(
    private val apiService: ApiService
): FilialsInfoRepo {
    override suspend fun getDataList(city: String): List<FilialModel> {
        return withContext(Dispatchers.IO){
            val response = apiService.getAllFilialsInfo(city)

             response.body()?.let { list ->
                 list.map { filial ->
                    val currencyList = mutableListOf(
                        CurrencyModel(filial.usdIn, filial.usdOut),
                        CurrencyModel(filial.eurIn, filial.eurOut),
                        CurrencyModel(filial.rubIn, filial.rubOut)
                    )
                    FilialModel(
                        filial.streetType,
                        filial.street,
                        filial.homeNumber,
                        filial.filialText,
                        currencyList
                    )
                }
            } ?: kotlin.run {
                emptyList()
            }
        }
    }
}