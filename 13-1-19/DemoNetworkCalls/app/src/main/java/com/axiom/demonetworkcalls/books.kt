package com.axiom.demonetworkcalls

/**
 * Created by lenovo on 13/01/2019.
 */

class Books(var userId:Int,var id :Int,var title :String, var body:String){
    override fun toString(): String {
        return "Books(userId=$userId, id=$id, title='$title', body='$body')"
    }
}
