package com.axiom.demotablayout

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import com.axiom.demotablayout.adapters.ViewPagerAdapter
import com.axiom.demotablayout.fragments.FirstFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tabLayout = findViewById<TabLayout>(R.id.tab)
        tabLayout.setTabTextColors(Color.GREEN, Color.BLUE)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        tabLayout.setupWithViewPager(viewPager)
        var arrayListFragment = ArrayList<Fragment>()
        val adapter = ViewPagerAdapter(arrayListFragment, this@MainActivity, supportFragmentManager)
        viewPager.adapter = adapter
        var count = 0
        add_btn.setOnClickListener {
            count++
            val firstFragment = FirstFragment()
            var b = Bundle()
            b.putString("key", count.toString())
            firstFragment.arguments = b
            arrayListFragment.add(firstFragment)
            adapter.notifyDataSetChanged()
        }


    }
}
