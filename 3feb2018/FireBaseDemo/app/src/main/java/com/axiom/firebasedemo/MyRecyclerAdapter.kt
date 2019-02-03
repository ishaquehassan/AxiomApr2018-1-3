package com.axiom.firebasedemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.item_layout.view.*

class MyRecyclerAdapter(var ctx: Context, var dataList: ArrayList<String>) :
    RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        var view: View = LayoutInflater.from(p0.context).inflate(R.layout.item_layout, null)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(viewHolder: MyViewHolder, p1: Int) {
        val data = dataList.get(p1)
        if (data != null) {
            viewHolder.tv!!.text = data
        }
    }

    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each name to
        val tv = view.text_view
    }

}
