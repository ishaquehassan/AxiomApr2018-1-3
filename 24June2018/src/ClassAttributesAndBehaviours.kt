fun main(args: Array<String>) {

    var teacher1:Teacher=Teacher()
    var teacher2:Teacher=Teacher()
    teacher1.name="Java"
    teacher1.email="J@email.com"
    teacher1.age=19
    teacher2.name="Java2"
    teacher2.email="Jabc@emaaail.com"
    teacher2.age=29
    teacher1.printName()
    teacher2.printName()
}

class Teacher{
    var name:String=""
    var email:String=""
    var age=0

    fun printName(){
        println("name of Teacher is $name")
    }
}