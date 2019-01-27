package com.axiom.labtask

/**
 * Created by lenovo on 20/01/2019.
 */
;

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class MyAdapter(var ctx: Context, var list: ArrayList<Post>) : RecyclerView.Adapter<MyAdapter.viewHolder>() {
    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val post = list[position]
        holder.title.setText(post.title)
        holder.body.setText(post.body)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val view = LayoutInflater.from(ctx).inflate(R.layout.row, parent, false)
        return viewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    inner class viewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        var title: TextView = view.findViewById(R.id.title)
        var body: TextView = view.findViewById(R.id.body)
    }
}