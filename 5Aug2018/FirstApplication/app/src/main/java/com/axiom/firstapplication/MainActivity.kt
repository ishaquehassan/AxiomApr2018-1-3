package com.axiom.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myTV = findViewById<TextView>(R.id.mytextview)

        myTV.text="Kotlin"


        /*ToExplored
        View initlize
        ClickListener{
        get text from TextView incr/decr set again
        }
         */




    }

}
