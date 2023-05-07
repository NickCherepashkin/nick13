package com.drozdova.app.presentation.view

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
        var currencyList = listOf<CurrencyModel>()

        view.tvFilialTitle.text = filial.filialText
        view.tvFilialAddress.text = "${filial.streetType} ${filial.street}, ${filial.homeNumber}"
        currencyList = filial.currencyList

//        currencyList.add(CurrencyModel(
//            filial.currencyList[0].title,
//            filial.currencyList[0].valueIn,
//            filial.currencyList[0].valueOut
//        ))
//        currencyList.add(CurrencyModel(
//            filial.currencyList[1].title,
//            filial.currencyList[1].valueIn,
//            filial.currencyList[1].valueOut
//        ))
//        currencyList.add(CurrencyModel(
//            filial.currencyList[2].title,
//            filial.currencyList[2].valueIn,
//            filial.currencyList[2].valueOut
//        ))
//        currencyList.add(CurrencyModel(
//            filial.currencyList[3].title,
//            filial.currencyList[3].valueIn,
//            filial.currencyList[3].valueOut
//        ))
//        currencyList.add(CurrencyModel(
//            filial.currencyList[4].title,
//            filial.currencyList[4].valueIn,
//            filial.currencyList[4].valueOut
//        ))
//        currencyList.add(CurrencyModel(
//            filial.currencyList[5].title,
//            filial.currencyList[5].valueIn,
//            filial.currencyList[5].valueOut
//        ))
        view.rvCurrencyList.adapter = adapter
        adapter.submit(currencyList)
    }
}