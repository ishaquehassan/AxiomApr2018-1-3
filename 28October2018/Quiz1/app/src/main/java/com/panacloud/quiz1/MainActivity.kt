package com.panacloud.quiz1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.view.ViewPager
import android.widget.Toast
import com.panacloud.quiz1.adapters.FragmentViewPagerAdapter
import com.panacloud.quiz1.interfaces.FragmentOneInteraction
import com.panacloud.quiz1.interfaces.FragmentTwoInteraction
import com.panacloud.quiz1.models.User

class MainActivity : AppCompatActivity(), FragmentOneInteraction {
    override fun sendData(user: User) {
        Toast.makeText(this, user.toString(), Toast.LENGTH_SHORT).show()

        interactionTwoSend?.recieveData(user)
    }

    var interactionTwoSend: FragmentTwoInteraction? = null

    public fun setInteractionTwo(interactionTwo: FragmentTwoInteraction) {
        this.interactionTwoSend = interactionTwo
    }

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
