package com.drozdova.app

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.drozdova.app.databinding.CurrencyItemBinding

class CurrencyListViewHolder(
    private val view: CurrencyItemBinding
) : ViewHolder(view.root) {

    fun bind(currency: CurrencyModel) {
        view.imvCurrency.setBackgroundResource(R.drawable.ic_eur_flag)
        view.tvCurrencyTitle.text = currency.title
        view.tvValueIn.text = currency.valueIn
        view.tvValueOut.text = currency.valueOut
    }
}

