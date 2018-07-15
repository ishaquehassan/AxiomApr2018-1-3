fun main(args: Array<String>) {

    //value type
    var a=4
    var b=a
    a=5
    println(a)//5
    println(b)//4

    //reference type
    var obj1 = class1("Kotlin",23)
    var obj2 =obj1
    obj1.name="Java"
    println(obj1.name)//Java
    println(obj2.name)//Kotlin
}
class class1(var name :String, var age:Int){

}