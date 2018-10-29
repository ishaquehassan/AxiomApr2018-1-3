package com.panacloud.quiz1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import com.panacloud.quiz1.adapters.FragmentViewPagerAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tablayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager = findViewById<ViewPager>(R.id.view_pager)


        tablayout.setupWithViewPager(viewPager)
        var adapter = FragmentViewPagerAdapter(this,
                supportFragmentManager)
        viewPager.adapter = adapter


    }
}
