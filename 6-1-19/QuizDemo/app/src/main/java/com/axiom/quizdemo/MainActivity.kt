package com.axiom.quizdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.axiom.quizdemo.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager= findViewById<ViewPager>(R.id.viewPager)
        val adapter=ViewPagerAdapter(this@MainActivity, supportFragmentManager)
        viewPager.adapter=adapter


    }
}
