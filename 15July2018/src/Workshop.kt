fun main(args: Array<String>) {

    var workshop=Workshop("Kotlin Workshop")
    workshop.welcomCutomer()
    var car:Vechile=Car("Mehran", "Suzuki","White")
    //car.service()
    var truck=Truck("Mazda", "Ford","Black")
    var spcar=SportsCar("A8", "Audi","Black")
//    workshop.doCarService(car)
//    workshop.doTruckService(truck)
    workshop.doService(car)
    workshop.doService(truck)
    workshop.doService(spcar)

}
class Workshop(var workshopName:String){

    fun welcomCutomer(){
        println("Welcome to $workshopName")
    }
    fun doCarService(c:Car){
        c.service()
        println("${c.name} is Cleaning")
    }
    fun doTruckService(t:Truck){
        t.service()
        println("${t.name} is Cleaning")
    }
    fun doService(v:Vechile){
        v.service()
        println("${v.name} is Cleaning")
    }
}