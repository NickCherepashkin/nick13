package com.drozdova.app.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.drozdova.app.R
import com.drozdova.app.databinding.FragmentMainBinding
import com.drozdova.app.presentation.viewmodel.FilialsInfoViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
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

        val currencyTitles = resources.getStringArray(R.array.currency_title)

        viewModel.dataList.observe(viewLifecycleOwner) { list ->
            adapter.submit(list, currencyTitles)
        }

        viewModel.loading.observe(viewLifecycleOwner) { loading ->
            binding.pbLoading.visibility = when(loading) {
                true -> View.VISIBLE
                false -> View.GONE
            }
            binding.spCities.isClickable = !loading
        }

        val cities = resources.getStringArray(R.array.cities)

        binding.spCities.onItemSelectedListener = object :
        AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                viewModel.startLoading()
                viewModel.showDataList(cities[position])
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {}
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}