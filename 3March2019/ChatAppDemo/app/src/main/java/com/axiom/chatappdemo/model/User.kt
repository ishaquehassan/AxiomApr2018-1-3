package com.axiom.chatappdemo.model

import android.os.Parcelable
import java.io.Serializable


data class User(
    var name: String = "",
    var email: String = "",
    var password: String = "",
    var uuid: String = "",
    var fcm: String =""

) : Serializable {
}