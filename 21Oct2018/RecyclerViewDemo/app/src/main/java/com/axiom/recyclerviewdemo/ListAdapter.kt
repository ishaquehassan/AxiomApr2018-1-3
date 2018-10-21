package com.axiom.recyclerviewdemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView

class ListAdapter(var ctx: Context, var myList: ArrayList<String>,
                  var viewClick: (view: View, item: String) -> Unit,
                  var delteClick: (view: View, position: Int) -> Unit
) : RecyclerView.Adapter<ListAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.card_row, null);
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {

        return myList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val desc = myList[position]
        holder.card_desc.text = desc


        holder.delete_btn.setOnClickListener {

            delteClick(it, position)
        }
        holder.view_btn.setOnClickListener {

            viewClick(it, desc)
        }
    }


    inner class CustomViewHolder(var view: View) : RecyclerView.ViewHolder(view) {
        var card_desc: TextView = view.findViewById(R.id.card_desc)
        var delete_btn: Button = view.findViewById(R.id.delete_btn)
        var view_btn: Button = view.findViewById(R.id.view_btn)
//        fun onBindView() {}
    }
}