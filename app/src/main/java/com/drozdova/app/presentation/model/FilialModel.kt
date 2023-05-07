package com.drozdova.app.presentation.model

data class FilialModel(
    val streetType: String,
    val street: String,
    val homeNumber: String,
    val filialText: String,
    val currencyList: List<CurrencyModel>
)

