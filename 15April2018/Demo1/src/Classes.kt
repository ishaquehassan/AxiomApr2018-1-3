fun main(args: Array<String>) {
    val personRef = Person("Value1")
    println(personRef.name)
    personRef.name = "newValue"
    println(personRef.name)


    var personRef2 = Person("Ali")

    println(personRef2.name)
    personRef2 = Person("Satish")

    val personRef3 = Person("Value3")
    println(personRef3.name)

    val personRef4 = Person("Value4")
    println(personRef4.name)



}
class Person(var name:String)