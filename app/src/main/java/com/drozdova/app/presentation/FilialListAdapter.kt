package com.drozdova.app.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.drozdova.app.databinding.FilialItemBinding
import com.drozdova.app.presentation.model.FilialModel

class FilialListAdapter : Adapter<FilialListViewHolder>() {
    private var _binding: FilialItemBinding? = null
    private val binding get() = _binding!!

    private var listOfFilials = listOf<FilialModel>()

    fun submit(listOfFilials: List<FilialModel>) {
        this.listOfFilials = listOfFilials
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilialListViewHolder {
        _binding = FilialItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FilialListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FilialListViewHolder, position: Int) {
        holder.bind(listOfFilials[position])
    }

    override fun getItemCount(): Int {
        return listOfFilials.size
    }
}