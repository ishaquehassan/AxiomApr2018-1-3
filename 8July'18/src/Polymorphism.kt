fun main(args: Array<String>) {
    var a = 5

//    val demoClass = demoClass()
//    demoClass.age
//demoClass not availbale
    var bus: Vechile = Bus()
//    var vechile:Bus = Vechile()
    var car = Car()
    var truck = Truck()


    bus.name = "bus"
    car.name = "car"
    truck.name = "truck"
    truck.run()
    bus.run()
    car.run()
    println(bus.name)//bus
    println(car.name)//car
    println(truck.name)//truck

}

open class Vechile() {
    var name: String = ""

    open fun run() {
        println("$name is running")
    }
}

class Car() : Vechile() {
    var model: String = ""
    override fun run() {
        println("$name is running")
        println("model is $model")

    }
}

class Bus() : Vechile() {
    var model: String = ""

}

class Truck() : Vechile() {
    var model: String = ""
}