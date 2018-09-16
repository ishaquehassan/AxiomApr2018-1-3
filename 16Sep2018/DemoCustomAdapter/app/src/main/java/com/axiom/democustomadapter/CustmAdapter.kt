package com.axiom.democustomadapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustmAdapter(var ctx: Context,
                   var arraylist: ArrayList<ModelClass>)
    : BaseAdapter() {
    override fun getItem(position: Int): Any {
        return arraylist.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return arraylist.size
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View = LayoutInflater.from(ctx).inflate(R.layout.list_item, null, false)
        var imageView: ImageView = view?.findViewById<ImageView>(R.id.image_item)!!
        var textView1: TextView = view?.findViewById<TextView>(R.id.name_view)
        var textView2: TextView = view?.findViewById<TextView>(R.id.age_view)

        var item = arraylist.get(position)
        println(item.toString())
        println(view)

        if (item.imageID != null) {
            imageView.setImageResource(item?.imageID!!)
        }
        textView1.text = item.name
        textView2.text = item.age

        return view

    }

}