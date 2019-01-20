package com.axiom.roomdb

import android.arch.persistence.room.Room
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDatabase = Room.databaseBuilder(this@MainActivity,
                MyDatabase::class.java,
                "MyDb")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()
        insert_btn.setOnClickListener {
            val title = title_et.text.toString()
            val desc = desc_et.text.toString()
            val movies = Movies(0, title, desc)

            myDatabase.getMyDao().insert(movies)
        }
        get_btn.setOnClickListener {
            val list = myDatabase.getMyDao().getAll()
            Log.d("TAG ", list.toString())
        }

    }
}
