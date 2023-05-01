package com.example.udemyprojectsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.udemyprojectsandroid.databinding.ActivityMyListViewBinding

class MyListView : AppCompatActivity() {
    private lateinit var binding: ActivityMyListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMyListViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val arrayOfStrings = arrayOf<String>("Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten")
//        var arrayOfNumber = Array(25, {i -> i*1})
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, arrayOfStrings)
        binding.listView.adapter = arrayAdapter
    }
}