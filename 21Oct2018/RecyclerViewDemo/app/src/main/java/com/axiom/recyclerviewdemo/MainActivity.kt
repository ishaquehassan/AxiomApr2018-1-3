package com.axiom.recyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var mAdapter: ListAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        var arrayList = ArrayList<String>()
        arrayList.add("Kotlin")
        arrayList.add("harris")
        arrayList.add("Kamran bhai")
        mAdapter = ListAdapter(this@MainActivity, arrayList,
                { view, item ->
                    Toast.makeText(this@MainActivity,
                            item, Toast.LENGTH_SHORT).show()
                },
                { view, position ->
                    arrayList.removeAt(position)
                    mAdapter?.notifyDataSetChanged()
                })

        recyclerView.layoutManager = GridLayoutManager(this@MainActivity, 2)
//        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
        recyclerView.adapter = mAdapter
        arrayList.add("harrisqwq")
        arrayList.add("Kamran bhaqweqwe i")


    }
}
