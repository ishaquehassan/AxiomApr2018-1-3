package com.axiom.androidclass23sep18

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onPause() {
        super.onPause()
        println("Tag onPause")
    }


    override fun onResume() {
        super.onResume()
        println("Tag onResume")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Tag onCreate")
        var start_btn = findViewById<Button>(R.id.start_btn)
        start_btn.setOnClickListener {
            var intent: Intent = Intent(this@MainActivity, demoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        println("Tag onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        println("Tag onReStart")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        println("Tag onRestoreInstant")

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        println("Tag onSavedInstance")
    }

    override fun onStop() {
        super.onStop()
        println("Tag onStart")
    }

    override fun onStart() {
        super.onStart()
        println("Tag onStart")
    }

}
