class Truck(name: String, brand: String, color: String) :Vechile(name, brand, color) {
     override fun service() {
        super.service()
         println("Truck is cleaning")
    }
}