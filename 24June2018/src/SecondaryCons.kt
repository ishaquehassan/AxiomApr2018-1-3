fun main(args: Array<String>) {

    var t = Teacher1("Kotlin")
    println(t.name)

    var t2 = Teacher1("java", "e@g.com")
    println(t2.name)
    println(t2.email)

    var t3 = Teacher1("java", "j@c.com", 19)
    println(t3.toString())

}

class Teacher1(name: String) {
    var name: String = ""
    var email: String = ""
    var age = 0

    init {
        this.name = name
    }

    constructor(name: String, email: String) : this(name) {
        this.email = email
    }

    constructor(name: String, email: String, age: Int) : this(name) {
        this.email = email
        this.age = age
    }

    //Cannot create same argument constructor
//    constructor(name: String, email: String, age: Int) : this(name) {
//        this.email = email
//        this.age = age
//    }

    override fun toString(): String {
        return "Teacher1(name='$name', email='$email', age=$age)"
    }

}