package com.axiom.chatappdemo.Utils

import android.app.Activity
import com.axiom.chatappdemo.model.User
import com.google.gson.Gson

class AppPref(var context: Activity) {


    fun getUser(): User? {
        val sharedPreferences = context.getSharedPreferences("App", 0)
        val userString = sharedPreferences.getString("user", null)
        if (userString != null) {
            val user = Gson().fromJson<User>(userString, User::class.java)
            return user
        } else {
            return null
        }
    }

    fun setUser(user: User) {
        val sharedPreferences = context.getSharedPreferences("App", 0)
        val edit = sharedPreferences.edit()
        edit.putString("user", Gson().toJson(user))
        edit.apply()
    }

}