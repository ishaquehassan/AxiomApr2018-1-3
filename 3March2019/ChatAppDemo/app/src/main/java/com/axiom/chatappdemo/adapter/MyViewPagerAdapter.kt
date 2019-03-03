package com.axiom.chatappdemo.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.axiom.chatappdemo.fragments.SignInFragment
import com.axiom.chatappdemo.fragments.SignUpFragment

class MyViewPagerAdapter(var ctx: Context, var fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                SignInFragment()
            }
            else -> SignUpFragment()

        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> {
                "Sign In"
            }
            else -> "Sign Up"
        }
    }
}