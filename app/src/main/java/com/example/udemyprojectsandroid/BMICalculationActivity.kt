package com.example.udemyprojectsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.udemyprojectsandroid.databinding.ActivityBmicalculationBinding

class BMICalculationActivity : AppCompatActivity() {
    lateinit var binding: ActivityBmicalculationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBmicalculationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateBtn.setOnClickListener() {
            calculateFunction(it)
        }
    }
    fun calculateFunction(view: View) {

        val weightInPnd = binding.weightTextView.text.toString().toDouble()
        val heightInInch = binding.heightTextView.text.toString().toDouble()
        val myBMI: Float = calculate(weightInPnd, heightInInch)
        binding.bmiTextView.visibility = View.VISIBLE
        binding.bmiTextView.text = myBMI.toString()
        if(myBMI < 18.5) {
            binding.imageView.setImageResource(R.drawable.underweight)
        } else if(myBMI in 18.5..24.9) {
            binding.imageView.setImageResource(R.drawable.healthy)
        } else if(myBMI in 25.0..29.9) {
            binding.imageView.setImageResource(R.drawable.overweight)
        } else {
            binding.imageView.setImageResource(R.drawable.obesity)
        }
    }
    fun calculate(weight: Double, height: Double): Float {
        var myBmi = ((weight * 0.45) / ((height * 0.025) * (height * 0.025))).toFloat()
        return myBmi
    }
}