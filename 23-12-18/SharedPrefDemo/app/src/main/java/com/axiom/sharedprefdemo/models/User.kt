package com.axiom.sharedprefdemo.models

/**
 * Created by lenovo on 23/12/2018.
 */
class User(var name:String,
           var email:String,
           var age:String) {

    override fun toString(): String {
        return "User(name='$name', email='$email', age='$age')"
    }
}

/*
*   {
*   "name":"harris",
*   "email":"harrisdas0@gmail.com"
*   "age":1
*   }
* */