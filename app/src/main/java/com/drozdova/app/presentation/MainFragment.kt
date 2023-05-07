package com.drozdova.app.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.drozdova.app.data.DataRepoImpl
import com.drozdova.app.databinding.FragmentMainBinding
import com.drozdova.app.domain.interactor.DataInteractor

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: FilialListAdapter
    private lateinit var interactor: DataInteractor

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        interactor = DataInteractor(DataRepoImpl())

        adapter = FilialListAdapter()
        binding.rvFilialList.adapter = adapter
        val list = interactor.getDataList()
        adapter.submit(list)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}