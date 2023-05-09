package com.drozdova.app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.drozdova.app.R
import com.drozdova.app.databinding.ActivityMainBinding
import com.drozdova.app.presentation.view.MainFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var checkNetworkConnection: InternetConnection

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, MainFragment())
            .commit()

        callNetworkConnection()
    }

    private fun callNetworkConnection() {
        checkNetworkConnection = InternetConnection(application)
        checkNetworkConnection.observe(this) { isConnected ->
            if (isConnected) {
                binding.layoutConnectionError.visibility = View.GONE
            } else {
                binding.layoutConnectionError.visibility = View.VISIBLE
            }
        }
    }
}