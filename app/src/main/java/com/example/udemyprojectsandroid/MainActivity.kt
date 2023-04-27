package com.example.udemyprojectsandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.udemyprojectsandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.guessMyNumberActivityBtn.setOnClickListener {
            val Intent = Intent(this, GuessMyNumberActivity::class.java)
            startActivity(Intent)
        }

        binding.bmiActivityBtn.setOnClickListener {
            val Intent = Intent(this, BMICalculationActivity::class.java)
            startActivity(Intent)
        }
    }
}