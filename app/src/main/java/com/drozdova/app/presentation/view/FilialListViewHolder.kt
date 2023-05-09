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
    fun bind(currencyTitles: Array<String>, filial: FilialModel) {
        val adapter = CurrencyListAdapter()
        val currencyList: List<CurrencyModel>

        view.tvFilialTitle.text = filial.filialText
        view.tvFilialAddress.text = "${filial.streetType} ${filial.street}, ${filial.homeNumber}"
        currencyList = filial.currencyList

        view.rvCurrencyList.adapter = adapter
        adapter.submit(currencyTitles, currencyList)
    }
}