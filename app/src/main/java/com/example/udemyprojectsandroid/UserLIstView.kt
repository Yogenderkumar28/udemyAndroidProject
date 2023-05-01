package com.example.udemyprojectsandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.udemyprojectsandroid.databinding.ActivityUserListViewBinding

class UserLIstView : AppCompatActivity() {
    private lateinit var binding: ActivityUserListViewBinding
    private lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityUserListViewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.success, R.drawable.success, R.drawable.success, R.drawable.success,
            R.drawable.success, R.drawable.success, R.drawable.success,
            R.drawable.success, R.drawable.success
        )

        val name = arrayOf(
            "Shubham",
            "Saviour",
            "Sparsh",
            "Shashank",
            "Yogender Kumar",
            "Mike",
            "Eleven",
            "Shashi",
            "Atika"
        )

        val lastMessage = arrayOf(
            "Hello, sunshine!",
            "How are you?",
            "Oh, your rays are already making my day brighter!",
            "Howdy, partner!",
            "Hey, howdy, hi! How is it going?",
            "What’s kicking, little chicken?",
            "Howdy-doody!",
            "Tell me what’s new!",
            "Hey there, freshman!" ,"Wassup?"
        )

        val lastSeen = arrayOf(
            "8:45 pm","9:00 pm", "7:34 pm","6:32 pm","5:76 pm","5:00 am","7:34 pm","2:32 pm", "7:76 am"
        )

        val phoneNo = arrayOf(
            "999103256", "999234565", "958506582", "9958203228", "9492112123", "9432310123", "98656656223", "9421211232", "9867549559"
        )

        val country = arrayOf(
            "India", "Russia", "America", "Uzbekistan", "Pakistan", "Afganistan", "Sri Lanka", "Nepal", "China"
        )

        userArrayList = ArrayList()

        for(i in name.indices) {
            val user = User(name[i], lastMessage[i], lastSeen[i], phoneNo[i], country[i], imageId[i])
            userArrayList.add(user)
        }
        binding.userListView.adapter = MyAdapter(this, userArrayList)

    }
}