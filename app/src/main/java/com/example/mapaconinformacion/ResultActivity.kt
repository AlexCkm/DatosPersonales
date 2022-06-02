package com.example.mapaconinformacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mapaconinformacion.databinding.ActivityMainBinding
import com.example.mapaconinformacion.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityResultBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val datos = intent.extras
    }
}