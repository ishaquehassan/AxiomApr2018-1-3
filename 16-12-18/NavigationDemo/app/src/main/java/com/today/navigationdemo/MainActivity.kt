package com.today.navigationdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.item1 -> {
            Toast.makeText(this@MainActivity, "Item1 ",Toast.LENGTH_SHORT).show()
            }
            R.id.item2 -> {
                Toast.makeText(this@MainActivity, "Item2 ",Toast.LENGTH_SHORT).show()

            }
            R.id.item3 -> {
                Toast.makeText(this@MainActivity, "Item3 ",Toast.LENGTH_SHORT).show()

            }
            else -> {
            }
        }

        val drawer = findViewById<DrawerLayout>(R.id.drawer)
        drawer.closeDrawer(GravityCompat.START)
        return true;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar= findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
        val drawer = findViewById<DrawerLayout>(R.id.drawer)

        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar,R.string.navigation_drawer_open, R.string.navigation_drawer_close)


        drawer.addDrawerListener(toggle)
        toggle.syncState()
        var navigationView = findViewById<NavigationView>(R.id.navigationDrawer)

        navigationView.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        val drawer = findViewById<DrawerLayout>(R.id.drawer)
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
//    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
////        super.onCreateOptionsMenu(menu)
//        menuInflater.inflate(R.menu.menu,menu)
//        return true
//    }
}
