package com.axiom.authentication.registration

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.axiom.authentication.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.container, LoginFragment()).commit()

    }

}
