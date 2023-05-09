package com.drozdova.app.presentation.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.drozdova.app.databinding.FilialItemBinding
import com.drozdova.app.presentation.model.FilialModel

class FilialListAdapter : Adapter<FilialListViewHolder>() {
    private var _binding: FilialItemBinding? = null
    private val binding get() = _binding!!

    private var listOfFilials = mutableListOf<FilialModel>()
    private lateinit var currencyTitles : Array<String>

    fun submit(listOfFilials: List<FilialModel>, currencyTitles: Array<String>) {
        this.currencyTitles = currencyTitles
        this.listOfFilials.clear()
        this.listOfFilials.addAll(listOfFilials.toMutableList())
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilialListViewHolder {
        _binding = FilialItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilialListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FilialListViewHolder, position: Int) {
        holder.bind(currencyTitles, listOfFilials[position])
    }

    override fun getItemCount(): Int {
        return listOfFilials.size
    }
}