fun main(args: Array<String>) {

    var laptop = Laptop("T43", 12, 200.0)
    var mobile = Mobile("Moto", 22, 200.0)
    var mobile2:InventoryItem = Mobile("Moto eg", 22, 200.0)
    mobile.model
//    mobile2.model
//    var inventoryItem = InventoryItem("Moto", 22, 200.0) can not create object of Abstract class
}

abstract class InventoryItem(var name: String, var id: Int, var price: Double) {
    abstract var brand: String
    var type:String="abc"

    abstract fun buyItem(id:Int)
    abstract fun sellItem()
    abstract fun getItemPrice():Double
    fun viewItemName() {
        println("the name is $name")
    }
}

class Mobile(name: String, id: Int, price: Double) : InventoryItem(name, id, price) {
    var model:String="model"
    override fun getItemPrice(): Double {
        return price
    }

    override var brand: String = ""
    override fun sellItem() {
        println("Item sold")
    }

    override fun buyItem(id: Int) {
        println("Item purchased")
    }
}

class Laptop(name: String, id: Int, price: Double) : InventoryItem(name, id, price) {
    override fun getItemPrice(): Double {
        return price
    }

    override var brand: String = ""
    override fun sellItem() {
        println("Item sold")
    }

    override fun buyItem(id: Int) {
        println("Item purchased")

    }
}