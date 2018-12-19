package com.today.navigationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.view.MenuItem
import android.widget.Toast

class BottomNavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)
        val bottom_nav= findViewById<BottomNavigationView>(R.id.bottom_nav)
        bottom_nav.setOnNavigationItemSelectedListener(bottomClick)

    }
    val bottomClick=BottomNavigationView.OnNavigationItemSelectedListener({
        when (it.itemId) {
            R.id.menu1 -> {
                Toast.makeText(this, "Menu1 ", Toast.LENGTH_SHORT).show()
            }
            R.id.menu2 -> {
                Toast.makeText(this, "Menu 2", Toast.LENGTH_SHORT).show()
            }
            R.id.menu3 -> {
                Toast.makeText(this, "Menu 3", Toast.LENGTH_SHORT).show()
            }
            else -> {
            }
        }
        true
    })
}
