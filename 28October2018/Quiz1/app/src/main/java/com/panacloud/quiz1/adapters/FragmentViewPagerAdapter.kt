package com.panacloud.quiz1.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.app.ListFragment
import android.support.v4.view.ViewPager
import com.panacloud.quiz1.fragments.AddDetailsFragment

class FragmentViewPagerAdapter(var ctx: Context, var fm: FragmentManager) :
        FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {

        when (position) {
            0 -> return com.panacloud.quiz1.fragments.ListFragment()
            else -> return AddDetailsFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "TAB ${position+1}"
    }

    override fun getCount(): Int {

        return 2
    }
}