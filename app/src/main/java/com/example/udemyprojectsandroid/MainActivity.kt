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
            val intent = Intent(this, GuessMyNumberActivity::class.java)
            startActivity(intent)
        }

        binding.bmiActivityBtn.setOnClickListener {
            val intent = Intent(this, BMICalculationActivity::class.java)
            startActivity(intent)
        }

        binding.myListViewActivityBtn.setOnClickListener {
            val intent = Intent(this, MyListView::class.java)
            startActivity(intent)
        }

        binding.numberListActivityBtn.setOnClickListener {
            val intent = Intent(this, NumberList::class.java)
            startActivity(intent)
        }

        binding.userProfileView.setOnClickListener {
            val intent = Intent(this, UserLIstView::class.java)
            startActivity(intent)
        }
    }
}