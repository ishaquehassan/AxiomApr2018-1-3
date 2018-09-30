package com.axiom.androidclass23sep18

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle

class demoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
        println("Tag 2 onCreate")
    }


    override fun onDestroy() {
        super.onDestroy()
        println("Tag 2 onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        println("Tag 2 onReStart")
    }

    override fun onPause() {
        super.onPause()
        println("Tag 2 onPause")
    }


    override fun onResume() {
        super.onResume()
        println("Tag 2 onResume")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        println("Tag 2 onRestoreInstant")

    }

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        println("Tag 2 onSavedInstance")
    }

    override fun onStop() {
        super.onStop()
        println("Tag 2 onStart")
    }

    override fun onStart() {
        super.onStart()
        println("Tag 2 onStart")
    }

}
