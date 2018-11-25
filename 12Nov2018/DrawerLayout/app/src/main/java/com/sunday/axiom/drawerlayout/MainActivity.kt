package com.sunday.axiom.drawerlayout

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.DrawerLayout

class MainActivity : AppCompatActivity() {


    private lateinit var drawerlayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        drawerlayout = findViewById<DrawerLayout>(R.id.drawer_layout)


    }
}
