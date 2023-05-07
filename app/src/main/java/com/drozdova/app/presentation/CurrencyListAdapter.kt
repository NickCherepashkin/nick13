package com.drozdova.app.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.drozdova.app.databinding.CurrencyItemBinding
import com.drozdova.app.presentation.model.CurrencyModel

class CurrencyListAdapter : Adapter<CurrencyListViewHolder>() {
    private var _binding: CurrencyItemBinding? = null
    private val binding get() = _binding!!

    private var listOfCurrency = listOf<CurrencyModel>()

    fun submit(listOfCurrency: MutableList<CurrencyModel>) {
        this.listOfCurrency = listOfCurrency.toList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyListViewHolder {
        _binding = CurrencyItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CurrencyListViewHolder, position: Int) {
        holder.bind(listOfCurrency[position])
    }

    override fun getItemCount(): Int {
        return listOfCurrency.size
    }
}