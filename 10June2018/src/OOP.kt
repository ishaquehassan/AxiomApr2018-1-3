fun main(args: Array<String>) {
   var student:Student=Student()
    student.age=16
    student.name="Kotlin"
    student.email="abc@g.com"
    student.fatherName="Java"
    println("Student name is ${student.name}")
    println("Student email is ${student.email}")
    println("Student age is ${student.age}")

}

class Student{
    var name:String=""
    var age:Int=0
    var fatherName:String=""
    var email:String=""

}