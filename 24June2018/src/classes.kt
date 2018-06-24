fun main(args: Array<String>) {

    var student1:Student=Student()
    println("name :${student1.name}")
    student1.name="Kotlin Object"
    println("name :${student1.name}")
//    student1.email="email"
    var st:String="kotlin"
}
private class Student {
    var name:String=""
    var email:String=""
    var age:Int=0

}