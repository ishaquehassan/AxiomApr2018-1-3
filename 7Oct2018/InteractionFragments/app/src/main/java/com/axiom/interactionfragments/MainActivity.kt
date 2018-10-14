package com.axiom.interactionfragments

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), SenderFragment.myCallback {
    override fun changeBakground() {
        container2.setBackgroundResource(R.color.colorAccent)
    }

    override fun changeText(text: String) {
        Toast.makeText(this@MainActivity, text, Toast.LENGTH_LONG).show()
    }
var fragment1=RecieverFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        supportFragmentManager
                .beginTransaction()
                .add(R.id.container1, SenderFragment())
                .commit()

        supportFragmentManager
                .beginTransaction()
                .add(R.id.container2, RecieverFragment())
                .commit()
    }
}
