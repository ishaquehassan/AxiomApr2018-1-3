fun main(args: Array<String>) {

    //var student = Student2()
    var student1 = Student3("java","a@g.c0m",1)
    println(student1.name)
    println(student1.email)
    println(student1.age)

//    var s:Student3=Student3()
    //println(student.name)
}
class Student3(name:String, e:String,a:Int){

    var name:String=""
    var email:String=""
    var age:Int=1

    init {
        this.name=name
        this.email=e
        this.age=a
    }

}


class Student2{
    var name:String=""
    var email:String=""
    var age:Int
    init {
        name="kotlin"
        email="k@g.com"
        age=0
    }
}