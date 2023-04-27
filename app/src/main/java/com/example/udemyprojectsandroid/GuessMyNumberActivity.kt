package com.example.udemyprojectsandroid
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.udemyprojectsandroid.databinding.ActivityGuessMyNumberBinding



class GuessMyNumberActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGuessMyNumberBinding
    var number: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGuessMyNumberBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.questionTextView.text = resources.getString(R.string.first_question)
        number = 5

    }

    fun arrowDown() {
        if(number == 5) {
            number = 3
            binding.questionTextView.text = resources.getString(R.string.second_question)
        } else if(number == 3) {
            number = 2
            binding.questionTextView.text = resources.getString(R.string.third_question)
        } else if(number == 2) {
            number = 1
            binding.questionTextView.text = resources.getString(R.string.fourth_question)
        } else if(number == 7) {
            number = 6
            binding.questionTextView.text = resources.getString(R.string.seventh_question)
        } else if(number == 9) {
            number = 8
            binding.questionTextView.text = resources.getString(R.string.nineth_question)

        }
    }

    fun successFunction() {
        binding.successTextView.visibility = View.VISIBLE
        binding.questionTextView.visibility = View.INVISIBLE
        binding.successNumberView.visibility = View.VISIBLE
        binding.successNumberView.text = String.format(resources.getString(R.string.textview_target_number), number)
    }

    fun arrowUp() {
        if(number == 3) {
            number = 4
            binding.questionTextView.text = resources.getString(R.string.fifth_question)
        } else if(number == 5) {
            number = 7
            binding.questionTextView.text = resources.getString(R.string.sixth_question)
        } else if(number == 7) {
            number = 9
            binding.questionTextView.text = resources.getString(R.string.eighth_question)
        } else if(number == 9) {
            number = 10
            binding.questionTextView.text = resources.getString(R.string.tenth_question)
        }
    }

    fun resetFunction() {
        binding.successNumberView.visibility  = View.INVISIBLE
        binding.questionTextView.visibility = View.VISIBLE
        binding.questionTextView.text = resources.getString(R.string.first_question)
        number = 5
        binding.successTextView.visibility = View.INVISIBLE
    }
}