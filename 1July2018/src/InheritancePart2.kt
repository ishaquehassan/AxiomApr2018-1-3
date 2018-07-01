fun main(args: Array<String>) {
   var person= Person("Kotlin","abc@g.com",19)
   var student= Student(12,"Kotlin2","abcasds@g.com",55)
    person.printAll()
    student.printAll()

//    var name="asdf"
//    var name="asdf"
}
open class Person(open var name :String,var email:String,var age:Int){
    open fun printAll(){
        println("$name $email $age")
    }
}
class Student(var rollNumb:Int ,na :String ,em:String ,a:Int):Person(na,em, a){

    override var name="Java"
    override fun printAll(){
        println("$rollNumb $name $email $age")
    }

}