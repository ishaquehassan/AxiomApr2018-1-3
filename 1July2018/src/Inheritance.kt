fun main(args: Array<String>) {

    var a=A()
    a.printEmailAndName()
    var b=B()
    var c=C()
    var d=D()
    println(b.age)
    println(b.name)
    println(c.name)
    b.printEmailAndName()
    c.printEmailAndName()
    d.fatherName
    d.fatherName
    d.printEmailAndName()

}
class D():B(){

    var fatherName=""
}
class C():A(){
    var id =233
}
open class B():A(){
    var age=10


}

open class A(){
    var name ="kotlin"
    var email ="abc@g.com"
    init {
//        name=n
//        email=e
    }
    fun printEmailAndName(){
        println("name is $name and email is $email")
    }

}