fun main(args: Array<String>) {
    var student4 = Student4("Kotlin", 12,
            "k@g.com", 12312)
    println(student4.name)
    var student5 = Student5("Kotlin2", 122,
            "k2@g.com", 123122)
    println(student5.name)
    println(student5.email)
    println(student5.age)
    println(student5.id)
}

class Student4(n: String, a: Int,
               e: String, i: Int) {
    var name: String
    var email: String
    var id: Int
    var age: Int

    init {
        name = n
        email = e
        id = i
        age = a
    }
}

class Student5(var name: String, var age: Int,
               var email: String, var id: Int)