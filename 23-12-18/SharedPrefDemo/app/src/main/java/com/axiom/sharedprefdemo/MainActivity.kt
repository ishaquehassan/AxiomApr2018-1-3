package com.axiom.sharedprefdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.axiom.sharedprefdemo.models.User
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user_name =findViewById<EditText>(R.id.user_name)
        var user_email =findViewById<EditText>(R.id.user_email)
        var user_age =findViewById<EditText>(R.id.user_age)
        var submit_btn =findViewById<Button>(R.id.submit_btn)
        submit_btn.setOnClickListener {
            if(!user_name.text.isEmpty()){
                if(!user_email.text.isEmpty()){
                if(!user_age.text.isEmpty()) {

                    saveUser(user_name.text.toString().trim(),
                            user_email.text.toString().trim(),
                            user_age.text.toString().trim())
                }else{
                    user_age.error="Enter Age"

                }

                }else{
                    user_email.error="Enter Email"
                }
            }else{
                user_name.error="Enter Name"

            }
        }
        val sharedPreferences = getSharedPreferences("user", 0)

        val user_obj = sharedPreferences.getString("userObj", null)
        var gson =Gson()
        val userObject = gson.fromJson<User>(user_obj/*""*/, User::class.java)
//        val name = sharedPreferences.getString("name", "No Name")
//        val password = sharedPreferences.getString("pass", "No Password")
//        sharedPreferences.edit().clear().apply()
        if(userObject!=null){
        Toast.makeText(this@MainActivity,userObject.toString(), Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this@MainActivity,"Error", Toast.LENGTH_SHORT).show()

        }
//        Toast.makeText(this@MainActivity,password, Toast.LENGTH_SHORT).show()


    }

    private fun saveUser(name: String, email: String, age: String) {

        var user= User(name, email,age)
//        val userString = user.toString()
       var gson =Gson()
        val json = gson.toJson(user)

        val sharedPreferences = getSharedPreferences("user", 0)
        val editor = sharedPreferences.edit()
        editor.putString("userObj", json).apply()
//        editor.putstr
//        editor.putStr`ing("name",name).apply()
//        editor.putString("email", email).apply()
//        editor.putString("age",age).apply()

        Toast.makeText(this, "Registeration succesful ", Toast.LENGTH_SHORT).show()


    }
}
