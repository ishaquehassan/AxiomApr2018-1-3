fun main(args: Array<String>) {
    var human = Human()

    var student1:Human = Student()

    var teacher:Human = Teacher()

    var st1 = student1 as Student

//    run time error
//    var st3 = teacher as Studen


    var st2 = st1

    student1.name = "Kotlin"

    println(human.name)
    println(st1.name)
    println(st2.name)
    println(student1.name)
    println(teacher.name)

//    println(student.subject)


}