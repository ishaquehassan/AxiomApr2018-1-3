package com.axiom.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CustomAdapter(var ctx: Context, var myUsers: ArrayList<User>) : BaseAdapter() {
    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {
        var view = LayoutInflater.from(ctx).inflate(R.layout.list_row, null)

        var imgView: ImageView = view.findViewById<ImageView>(R.id.imgView)
        var name_text: TextView = view.findViewById<TextView>(R.id.name_tv)
        var desc_text: TextView = view.findViewById<TextView>(R.id.desc_tv)
        val user = myUsers[position]
        name_text.text = user.name
        desc_text.text = user.description
        view.setOnClickListener {
            Toast.makeText(ctx, user.name, Toast.LENGTH_SHORT).show()
        }


        return view
    }

    override fun getItem(position: Int): Any {
        return myUsers[position]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong();
    }

    override fun getCount(): Int {
        return myUsers.size
    }

}