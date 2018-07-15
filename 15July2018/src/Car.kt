open  class Car(name: String, brand: String, color: String) : Vechile(name, brand, color) {

   override fun service(){
        println("Car is cleaning")
    }
}