package com.axiom.androidclass23sep18

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recieving.*

class RecievingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recieving)
        val extras = intent.extras
        if (extras != null) {
            val myString = extras.getString("key",
                    "default")
            recieve_tv.setText(myString)
        }
        var intent = Intent(this@RecievingActivity,
                MainActivity::class.java)
        intent.flags=Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()

//        startActivity(Intent(this@RecievingActivity,
//                MainActivity::class.java))
    }
}
