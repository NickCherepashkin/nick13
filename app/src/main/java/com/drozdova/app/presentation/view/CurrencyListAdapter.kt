package com.drozdova.app.presentation.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.drozdova.app.databinding.CurrencyItemBinding
import com.drozdova.app.presentation.model.CurrencyModel

class CurrencyListAdapter : Adapter<CurrencyListViewHolder>() {
    private var _binding: CurrencyItemBinding? = null
    private val binding get() = _binding!!

    private var listOfCurrency = listOf<CurrencyModel>()
    private lateinit var currencyTitles: Array<String>

    fun submit(currencyTitles: Array<String>, listOfCurrency: List<CurrencyModel>) {
        this.currencyTitles = currencyTitles
        this.listOfCurrency = listOfCurrency
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyListViewHolder {
        _binding = CurrencyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CurrencyListViewHolder, position: Int) {
        holder.bind(currencyTitles[position],listOfCurrency[position], position)
    }

    override fun getItemCount(): Int {
        return listOfCurrency.size
    }
}