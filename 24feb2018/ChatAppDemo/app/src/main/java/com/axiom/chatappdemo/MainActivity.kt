package com.axiom.chatappdemo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.axiom.chatappdemo.adapter.MyViewPagerAdapter
import com.axiom.chatappdemo.dashboard.DashBoardActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*


//https://developer.android.com/jetpack/androidx/migrate
class MainActivity : AppCompatActivity() {
    lateinit var adapter: MyViewPagerAdapter
    override fun onStart() {
        super.onStart()
        if (FirebaseAuth.getInstance().currentUser != null) {
            startActivity(Intent(this@MainActivity, DashBoardActivity::class.java))
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tablayout.setupWithViewPager(viewPager)
        adapter = MyViewPagerAdapter(this@MainActivity, supportFragmentManager)
        viewPager.adapter = adapter


    }

}
