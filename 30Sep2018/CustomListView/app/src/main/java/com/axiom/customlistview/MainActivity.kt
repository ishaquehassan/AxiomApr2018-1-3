package com.axiom.customlistview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    lateinit var mAdapter: CustomAdapter
    lateinit var myUsers: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myUsers = ArrayList()

        myUsers.add(User("Harris", "Description1"))
        myUsers.add(User("Kamran", "Description2"))
        myUsers.add(User("Kotlin", "Description3"))
        mAdapter = CustomAdapter(this@MainActivity, myUsers)
        listView.adapter = mAdapter
        myUsers.add(User("New User", "new Description2"))
        myUsers.add(User("asdfasd", "asdfon3"))
        mAdapter.notifyDataSetChanged()


    }
}
