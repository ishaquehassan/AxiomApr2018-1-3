fun main(args: Array<String>) {

    var myInt: Int = 45

    var nullableInt: Int? = 10

    var newInt : Int = 10

    var newInt1 : Int? = null

    var a = myInt + newInt

    var b = nullableInt?.plus(myInt)

    //var c = nullableInt?.plus(newInt1!!)

    var d = nullableInt?.plus(newInt1?: 0)
    var e = (nullableInt?: 0).plus(newInt1?: 0)

    println(a)
    println(b)
    //println(c)
    println(d)


}