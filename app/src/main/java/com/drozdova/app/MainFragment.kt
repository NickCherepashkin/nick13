package com.drozdova.app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.drozdova.app.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: FilialListAdapter

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
        val list = listOf(
            FilialModel("2.8400","2.8900","3.0900","3.1700",
                "2.7000","3.7200","0.9040","1.0940",
                "76.4000","0.0094","0.0086","83.1000",
                "пр.","Партизанский","8-49","Отделение 100\\/1050"),
            FilialModel("2.8400","2.8900","3.0900","3.1700",
                "2.7000","3.7200","0.9040","1.0940",
                "76.4000","0.0094","0.0086","83.1000",
                "пр.","Партизанский","8-49","Отделение 100\\/1050"),
            FilialModel("2.8400","2.8900","3.0900","3.1700",
                "2.7000","3.7200","0.9040","1.0940",
                "76.4000","0.0094","0.0086","83.1000",
                "пр.","Партизанский","8-49","Отделение 100\\/1050"),
            FilialModel("2.8400","2.8900","3.0900","3.1700",
                "2.7000","3.7200","0.9040","1.0940",
                "76.4000","0.0094","0.0086","83.1000",
                "пр.","Партизанский","8-49","Отделение 100\\/1050"),
            FilialModel("2.8400","2.8900","3.0900","3.1700",
                "2.7000","3.7200","0.9040","1.0940",
                "76.4000","0.0094","0.0086","83.1000",
                "пр.","Партизанский","8-49","Отделение 100\\/1050")
        )
        adapter.submit(list)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}