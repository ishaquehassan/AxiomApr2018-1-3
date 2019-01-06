package com.axiom.quizdemo.model

/**
 * Created by lenovo on 06/01/2019.
 */
class User(var email:String/*my primary key*/, var name:String, var password:String ){
    override fun toString(): String {
        return "User(email='$email', name='$name', password='$password')"
    }
}