import javax.print.attribute.standard.PrinterMoreInfoManufacturer

fun main(args: Array<String>) {

//    var d=delegateClass("kotlin", 23,"av@g.com")
//    var car =Car("honda","2012","black","1800")
    var car1=Car("civic","2018","black","1200","honda",122200 , "car")
    println(car1.toString())
}

open class Machine(n: String) {
    var name = ""
    var cost = 0
    var type = ""
    var manufacturer = "not inserted"

    init {
        name = n
    }

    constructor(n: String, c: Int) : this(n) {
        this.cost = c
    }

    constructor(n: String, c: Int, type: String, manufacturer: String) : this(n, c) {
        this.type = type
        this.manufacturer = manufacturer
    }
}

class Car(name :String,cost:Int,type:String,manufacturer:String) : Machine(name,cost,type,manufacturer) {

    var model = ""
    var color = ""
    var hp = ""
//
//    constructor(name:String,m: String, color: String, hppp: String) : this(name) {
//        this.color = color
//        this.model = m
//        this.hp = hppp
//    }
    constructor(name:String,m: String, color: String, hppp: String,manuf:String,cost:Int,ty:String) : this(name,cost,ty,manuf) {
        this.color = color
        this.model = m
        this.hp = hppp
    }

    override fun toString(): String {
        return "Car(model='$model', color='$color', hp='$hp' $name , $manufacturer)"
    }

}

class delegateClass(name: String) {
    var name = ""
    var age = 0
    var email = ""

    init {
        this.name = name
    }

    constructor(name: String, age: Int) : this(name) {

        this.age = age
        println(age)
    }

    constructor(name: String, age: Int, email: String) : this(name, age) {
        this.email = email
    }

}