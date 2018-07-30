fun main(args: Array<String>) {
    var square = Square(1, 1)
//    square.getVolume()
}

abstract class Geometry(var length: Int, var width: Int) {
    abstract fun draw()
//    open fun getArea(){}
//    open fun getVolume(){}
//    fun getArea()
//    abstract fun Area()
    //  abstract fun Volume()

}

interface ITwoD {

    var area: Int
    fun showArea(): Int//abstract function
    fun demoFunction() {
        println("this is a 2d demo function")
    }

}

interface IThreeD {
    fun getVolume(): Int
}

class Square(length: Int, width: Int) : Geometry(length, width), ITwoD {
    override var area: Int = 0

    override fun showArea(): Int {
        return length * width
    }
//
//    override fun getArea() {
//        super.getArea()
//    }

    override fun draw() {
        println("draw square")
    }
}

class Box(var height: Int, length: Int, width: Int) : Geometry(length, width), ITwoD, IThreeD {
    override var area: Int = 0
    override fun showArea(): Int {
        return length * width
    }

    override fun getVolume(): Int {
        return length * width * height

    }

    override fun draw() {
        println("draw Box")
    }
}