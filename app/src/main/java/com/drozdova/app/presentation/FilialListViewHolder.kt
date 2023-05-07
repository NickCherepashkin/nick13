package com.drozdova.app.presentation

import android.annotation.SuppressLint
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.drozdova.app.databinding.FilialItemBinding
import com.drozdova.app.presentation.model.CurrencyModel
import com.drozdova.app.presentation.model.FilialModel

class FilialListViewHolder(
    private val view: FilialItemBinding
) : ViewHolder(view.root) {

    @SuppressLint("SetTextI18n")
    fun bind(filial: FilialModel) {
        val adapter = CurrencyListAdapter()
        val currencyList = mutableListOf<CurrencyModel>()

        view.tvFilialTitle.text = filial.filials_text
        view.tvFilialAddress.text = "${filial.street_type} ${filial.street}, ${filial.home_number}"

        currencyList.add(CurrencyModel("USD", "${filial.usdIn}", "${filial.usdOut}"))
        currencyList.add(CurrencyModel("EURO", "${filial.eurIn}", "${filial.eurOut}"))
        currencyList.add(CurrencyModel("RUB", "${filial.rubIn}", "${filial.rubOut}"))
        currencyList.add(CurrencyModel("USD / EURO", "${filial.usdEurIn}", "${filial.usdEurOut}"))
        currencyList.add(CurrencyModel("USD / RUB", "${filial.usdRubIn}", "${filial.usdRubOut}"))
        currencyList.add(CurrencyModel("RUB / EURO", "${filial.rubEurIn}", "${filial.rubEurOutut}"))
        view.rvCurrencyList.adapter = adapter
        adapter.submit(currencyList)
    }
}