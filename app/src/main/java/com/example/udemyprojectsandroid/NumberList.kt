package com.example.udemyprojectsandroid


import android.content.Context
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.udemyprojectsandroid.databinding.ActivityNumberListBinding

class NumberList : AppCompatActivity() {
    lateinit var binding: ActivityNumberListBinding
    var marrayList: ArrayList<Data> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNumberListBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        Initialise()

        var adapter = NumberAdapter(this, marrayList)
        binding.numberListListView.adapter = adapter

    }

    fun Initialise() {
        marrayList.add(Data("zero", "zeroaudio"))
        marrayList.add(Data("one", "oneaudio"))
        marrayList.add(Data("two", "twoaudio"))
        marrayList.add(Data("three", "threeaudio"))
        marrayList.add(Data("four", "fouraudio"))
        marrayList.add(Data("five", "fiveaudio"))
        marrayList.add(Data("six", "sixaudio"))
        marrayList.add(Data("seven", "sevenaudio"))
        marrayList.add(Data("eight", "eightaudio"))
        marrayList.add(Data("nine", "nineaudio"))
        marrayList.add(Data("ten", "tenaudio"))
    }
}

class NumberAdapter(context: Context, var arrayList: ArrayList<Data>) : BaseAdapter() {

    private var context: Context? = context

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view : View
        var inflater: LayoutInflater = context?.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var holder: ViewHolder

        if(convertView == null) {
            view  = inflater.inflate(R.layout.list_items, parent, false)
            holder = ViewHolder()
            holder.text = view.findViewById(R.id.list_text_view)
            holder.image = view.findViewById(R.id.list_image_view)

            view.tag = holder
        }else {
            convertView.also { view = it }
            (convertView.tag as ViewHolder).also { holder = it }
        }

        val textValue = holder.text
        textValue?.text = arrayList[position].textNumber

        val imageValue = holder.image
        var mediaPlayer: MediaPlayer?

        imageValue?.setOnClickListener {
            mediaPlayer = MediaPlayer.create(
                context, context?.resources!!.getIdentifier(arrayList[position].audioNumber, "raw", context?.packageName)
            )
            mediaPlayer?.start()
        }
        return view
    }

    private class ViewHolder {
        var text : TextView? = null
        var image: ImageView? = null
    }

}