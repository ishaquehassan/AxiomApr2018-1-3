package com.axiom.quizdemo.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import com.axiom.quizdemo.fragments.SignInFragment
import com.axiom.quizdemo.fragments.SignUpFragment

/**
 * Created by lenovo on 06/01/2019.
 */
class ViewPagerAdapter(var ctx:Context, var fm:FragmentManager ) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
     when(position){
         0->{
             return SignInFragment()
         }else ->{
         return SignUpFragment()

     }
     }
    }

    override fun getCount(): Int {
return 2;    }

}