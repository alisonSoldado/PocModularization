package com.example.thirdmodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.thirdmodule.databinding.ThirdActivityBinding

class ThirdActivity: AppCompatActivity() {

    private lateinit var binding: ThirdActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ThirdActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}