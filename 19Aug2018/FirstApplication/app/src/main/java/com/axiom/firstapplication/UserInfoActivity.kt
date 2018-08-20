package com.axiom.firstapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class UserInfoActivity : AppCompatActivity() {

    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)
        val usersList = ArrayList<User>()
        usersList.add(User("Kotlin", "abc@adf.com", 12))
        usersList.add(User("abc", "abcwer@adfqwe.com", 0))
        usersList.add(User("java", "abwec@adfdf.com", 22))
        usersList.add(User("Unknown", "xcvc@addff.com", 32))
        val next_btn = findViewById<Button>(R.id.btn_next)
        val prev_btn = findViewById<Button>(R.id.btn_prev)
        val name_tv = findViewById<TextView>(R.id.name_tv)
        val email_tv = findViewById<TextView>(R.id.email_tv)
        val age_tv = findViewById<TextView>(R.id.age_tv)
        val user = usersList.get(counter)
        name_tv.text = user.name
        email_tv.text = user.email
        age_tv.text = "${user.age}"


        next_btn.setOnClickListener {
            if (counter < usersList.size-1) {
                counter++;
                val user = usersList.get(counter)
                name_tv.text = user.name
                email_tv.text = user.email
                age_tv.text = "${user.age}"

            }
        }
        prev_btn.setOnClickListener {
            if (counter > 0) {
                counter--
                val user = usersList.get(counter)
                name_tv.text = user.name
                email_tv.text = user.email
                age_tv.text = "${user.age}"


            }
        }
    }
}
