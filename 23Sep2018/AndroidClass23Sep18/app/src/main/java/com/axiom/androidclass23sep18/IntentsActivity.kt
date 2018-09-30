package com.axiom.androidclass23sep18

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class IntentsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intents)
        var myEditText = findViewById<EditText>(R.id.myText)
        var send_btn = findViewById<Button>(R.id.send_btn)
        send_btn.setOnClickListener {
            var intent = Intent(this@IntentsActivity,
                    RecievingActivity::class.java)
        intent.putExtra("key",myEditText.text.toString())
        intent.putExtra("key",myEditText.text.toString()+"sdfjsfj")
            startActivity(intent)


        }


    }
}
