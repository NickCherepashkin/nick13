package com.drozdova.app.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drozdova.app.R
import com.drozdova.app.databinding.ActivityMainBinding
import com.drozdova.app.presentation.MainFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, MainFragment())
            .commit()
    }
}