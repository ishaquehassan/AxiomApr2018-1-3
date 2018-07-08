fun main(args: Array<String>) {
    val demoClass = demoClass()
    val demoClass2 = demoClass2()
    demoClass.age

}

open private class demoClass() {
    private var name = ""
    internal var age = ""
    protected var email = ""
    fun getAge(){
        age
    }
}

private class demoClass2() : demoClass() {
    constructor(e: String) : this() {
        this.email
    }

    fun getEmail() {
    age
        println(email)
    }
}