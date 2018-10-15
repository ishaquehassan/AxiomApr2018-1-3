package com.axiom.demotablayout.adapters

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.widget.Toast
import com.axiom.demotablayout.fragments.FirstFragment
import com.axiom.demotablayout.fragments.SecondFragment
import com.axiom.demotablayout.fragments.ThirdFragment

class ViewPagerAdapter(var list: ArrayList<Fragment>, var ctx: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return list.get(position)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return "TAB ${position + 1}"
    }
}