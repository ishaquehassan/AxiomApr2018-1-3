fun main(args: Array<String>) {
    val myArray = intArrayOf(12, 23, 123, 43, 12334, 23)
    val myInt: Int = 12
    val myFun: () -> Unit = { println("Im Lambda") }
    val myFun1: () -> Unit = { println("Im new Lambda") }
//    myFun()
    hFun(myInt, myArray, myFun)
    hFun(myInt, myArray, myFun1)

    hFun(34, intArrayOf(23, 23, 123), {
        println("Im Lambda 2")
    })

    hFun2({ number ->
        println("number $number")
        number.toString()
    })
}

fun hFun(a: Int, myIntArray: IntArray,
         myFunction: () -> Unit  ) {
    println(a)
    println(myIntArray)
    println(myFunction)
    myFunction()
}

fun hFun2(myFunction: (Int) -> String) {
    myFunction(12)
}