package com.drozdova.app.data

import com.drozdova.app.domain.repository.FilialsInfoRepo
import com.drozdova.app.presentation.model.CurrencyModel
import com.drozdova.app.presentation.model.FilialModel
import javax.inject.Inject

class FilialsInfoRepoImpl @Inject constructor(): FilialsInfoRepo {
    override fun getDataList(): List<FilialModel> {
        return listOf(
            FilialModel(
                "пр.","Партизанский","8-49","Отделение 100\\1050",
                listOf(
                    CurrencyModel("USD", "2.7000", "3.7200"),
                    CurrencyModel("EURO","0.9040", "1.0940"),
                    CurrencyModel("RUB","76.4000","0.0094"),
                    CurrencyModel("USD / EURO","0.0086","83.1000"),
                    CurrencyModel("USD / RUB","2.8400","2.8900"),
                    CurrencyModel("RUB / EURO","3.0900","3.1700")
                )),
            FilialModel(
                "пр.","Партизанский","8-49","Отделение 100\\1050",
                listOf(
                    CurrencyModel("USD", "2.7000", "3.7200"),
                    CurrencyModel("EURO","0.9040", "1.0940"),
                    CurrencyModel("EURO","76.4000","0.0094"),
                    CurrencyModel("EURO","0.0086","83.1000"),
                    CurrencyModel("EURO","2.8400","2.8900"),
                    CurrencyModel("EURO","3.0900","3.1700")
                )),
            FilialModel(
                "пр.","Партизанский","8-49","Отделение 100\\1050",
                listOf(
                    CurrencyModel("USD", "2.7000", "3.7200"),
                    CurrencyModel("EURO","0.9040", "1.0940"),
                    CurrencyModel("EURO","76.4000","0.0094"),
                    CurrencyModel("EURO","0.0086","83.1000"),
                    CurrencyModel("EURO","2.8400","2.8900"),
                    CurrencyModel("EURO","3.0900","3.1700")
                )),
            FilialModel(
                "пр.","Партизанский","8-49","Отделение 100\\1050",
                listOf(
                    CurrencyModel("USD", "2.7000", "3.7200"),
                    CurrencyModel("EURO","0.9040", "1.0940"),
                    CurrencyModel("EURO","76.4000","0.0094"),
                    CurrencyModel("EURO","0.0086","83.1000"),
                    CurrencyModel("EURO","2.8400","2.8900"),
                    CurrencyModel("EURO","3.0900","3.1700")
                )),
            FilialModel(
                "пр.","Партизанский","8-49","Отделение 100\\1050",
                listOf(
                    CurrencyModel("USD", "2.7000", "3.7200"),
                    CurrencyModel("EURO","0.9040", "1.0940"),
                    CurrencyModel("EURO","76.4000","0.0094"),
                    CurrencyModel("EURO","0.0086","83.1000"),
                    CurrencyModel("EURO","2.8400","2.8900"),
                    CurrencyModel("EURO","3.0900","3.1700")
                ))
        )
    }
}