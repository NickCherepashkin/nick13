package com.drozdova.app.presentation.view

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.drozdova.app.R
import com.drozdova.app.databinding.CurrencyItemBinding
import com.drozdova.app.presentation.model.CurrencyModel

class CurrencyListViewHolder(
    private val view: CurrencyItemBinding
) : ViewHolder(view.root) {

    fun bind(title: String, currency: CurrencyModel, position: Int) {

        view.imvCurrency.setBackgroundResource(R.drawable.ic_eur_flag)
        view.tvCurrencyTitle.text = title
        view.tvValueIn.text = currency.valueIn
        view.tvValueOut.text = currency.valueOut
        view.imvCurrency.setBackgroundResource(when(position){
            0 -> R.drawable.ic_usd_flag
            1 -> R.drawable.ic_eur_flag
            else -> R.drawable.ic_rub_flag
        })
    }
}

