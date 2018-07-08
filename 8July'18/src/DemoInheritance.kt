open class Human{
    var name:String = ""
    var age:Int = 0
}
class Student() :Human(){
    var subject:String = ""
}
class Teacher:Human()

fun main(args: Array<String>) {
    var human = Human()
    var student:Student = Student()
    var teacher:Human = Teacher()

    human.name = "Kotlin"

    println(human.name)
    println(student.name)
    println(teacher.name)
    println(student.subject)

}