package com.axiom.firebasedemo

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.student_layout.view.*

class StudentListAdapter(var ctx: Context, var dataList: ArrayList<Student>) :
    RecyclerView.Adapter<StudentListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): StudentListAdapter.MyViewHolder {
        var view: View = LayoutInflater.from(p0.context).inflate(R.layout.student_layout, null)
        return StudentListAdapter.MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(viewHolder: StudentListAdapter.MyViewHolder, p1: Int) {
        val data = dataList.get(p1)
        if (data != null) {

            viewHolder.tv.text = data.name
            viewHolder.rollNo_tv.text = data.rollNo
            viewHolder.age_tv.text = "" + data.age

        }
    }


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each name to
        val tv = view.name_tv
        val age_tv = view.age_tv
        val rollNo_tv = view.rollNo_tv
    }
}
