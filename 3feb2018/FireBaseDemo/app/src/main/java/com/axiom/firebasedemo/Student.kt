package com.axiom.firebasedemo

data class Student(var name: String? = null, var rollNo: String = "", var age: Int = 0,var id:String="") {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Student

        if (id != other.id) return false

        return true
    }

}