package com.axiom.chatappdemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.axiom.chatappdemo.R
import com.axiom.chatappdemo.model.User

class UsersListAdapter(
    var context: Context, var userList: ArrayList<User>,
    var itemClick: (user: User) -> Unit
) :
    RecyclerView.Adapter<UsersListAdapter.myViewHoder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHoder {
        val view = LayoutInflater.from(context).inflate(R.layout.row_users, null, false)
        return myViewHoder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: myViewHoder, position: Int) {
        holder.bindUser(userList[position])
    }

    inner class myViewHoder(var view: View) : RecyclerView.ViewHolder(view) {
        val name_user = view.findViewById<TextView>(R.id.name_user)
        fun bindUser(user: User) {
            name_user.text = user.name

            view.setOnClickListener {
                itemClick(user)
            }
        }
    }
}