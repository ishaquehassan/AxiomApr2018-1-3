fun main(args: Array<String>) {

    var std1=Student1()
    var std2=Student1()

    std1.name="java"
    std2.name="Kotlin"

    println("std1 name is ${std1.name}")
    println("std2 name is ${std2.name}")
}


class Student1{
    var name:String=""
    var age:Int=0
    var fatherName:String=""
    var email:String=""

}