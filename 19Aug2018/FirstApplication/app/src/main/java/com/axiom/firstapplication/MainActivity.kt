package com.axiom.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inc_btn_1 = findViewById<View>(R.id.inc_btn) as Button
        val counterText = findViewById<TextView>(R.id.myCounterText)


//        inc_btn_1.setOnClickListener(object :View.OnClickListener{
//            override fun onClick(v: View?) {
//            }
//        }) //old technique

        inc_btn_1.setOnClickListener {

            counter++
//            counterText.setText(counter)//old technique
            counterText.text = "$counter"
        }
    }

}
