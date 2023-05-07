package com.drozdova.app.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.drozdova.app.databinding.FragmentMainBinding
import com.drozdova.app.presentation.viewmodel.FilialsInfoViewModel

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: FilialListAdapter
    private val viewModel: FilialsInfoViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = FilialListAdapter()
        binding.rvFilialList.adapter = adapter

        viewModel.showDataList()
        viewModel.dataList.observe(viewLifecycleOwner) { list ->
            adapter.submit(list)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}