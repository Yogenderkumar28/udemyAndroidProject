package com.example.udemyprojectsandroid

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context, R.layout.user_list_items, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var inflater: LayoutInflater = LayoutInflater.from(context)
        val view: View = inflater.inflate(R.layout.user_list_items, null)

        var imageView: ImageView = view.findViewById(R.id.profile_pic)
        var username: TextView = view.findViewById(R.id.person_name)
        var message: TextView = view.findViewById(R.id.last_message)
        var lastSeen: TextView = view.findViewById(R.id.last_seen)

        imageView.setImageResource(arrayList[position].imageId)
        username.text = arrayList[position].name
        message.text = arrayList[position].lastMessage
        lastSeen.text = arrayList[position].lastSeen
        return view
    }
}