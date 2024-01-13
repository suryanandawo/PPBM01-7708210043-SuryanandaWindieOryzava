package com.example.prominentstudio

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context : Activity, private val arrayList : ArrayList<user>) : ArrayAdapter<user>(context,
    R.layout.list_item,arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_item, null)

        val imageView : ImageView = view.findViewById(R.id.pp2)
        val username : TextView = view.findViewById(R.id.mamad)
        val lastMsg : TextView = view.findViewById(R.id.mesege)
        val waktu : TextView = view.findViewById(R.id.waktu)

        imageView.setImageResource(arrayList[position].imageId)
        username.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMessage
        waktu.text = arrayList[position].lastMsgTime



        return view
    }
}