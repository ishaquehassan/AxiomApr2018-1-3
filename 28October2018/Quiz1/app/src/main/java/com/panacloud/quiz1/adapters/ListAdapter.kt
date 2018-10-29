package com.panacloud.quiz1.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.panacloud.quiz1.R
import com.panacloud.quiz1.models.user

class ListAdapter(var ctx: Context,
                  var myUserList: ArrayList<user>)
    : RecyclerView.Adapter<ListAdapter.CustomViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {

        val view = LayoutInflater.from(ctx).inflate(R.layout.card_row, null)
        var customViewHolder = CustomViewHolder(view)
        return customViewHolder
    }

    override fun getItemCount(): Int {

        return myUserList.size
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        val user = myUserList[position]
        holder.name_Tv.text=user.fullName
        holder.desc_Tv.text = ""+user.RegNumber


    }


    inner class CustomViewHolder(var view: View)
        : RecyclerView.ViewHolder(view) {

        var name_Tv: TextView = view.findViewById(R.id.name);
        var desc_Tv: TextView = view.findViewById(R.id.desc);
    }
}