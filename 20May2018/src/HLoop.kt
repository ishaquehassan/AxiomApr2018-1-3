fun main(args: Array<String>) {
    val intArrayOf = intArrayOf(223, 23, 23, 123, 23)
//
//    val operationFun: (Int) -> Unit = { number ->
//        var num = number * 2
//        println(num)
//    }
//    val plusOperationFun: (Int) -> Unit = { number ->
//        var num = number + 2
//        println(num)
//    }
//    myFun(intArrayOf, operationFun)
//
//    myFun(intArrayOf, plusOperationFun)
//
//    myFun(intArrayOf, { number ->
//        var num = number - 2
//        println(num)
//    })

    val myFun = myFun2(intArrayOf, { number ->
        number * 2
    })
    val array = myFun()
    for (i in array) {
        print(" "+i)
    }


}

fun myFun(a: IntArray, operation: (Int) -> Unit) {
    for (i in a) {
//        println("Number $i")
        operation(i)
    }
}

fun myFun2(a: IntArray, operation: (Int) -> Int): () -> Array<Int> {

    var myArray = Array<Int>(a.size, { 0 })
    for ((index, value) in a.withIndex()) {

        val returnValue = operation(value)
        myArray[index] = returnValue

    }
    val retunArrayFun: () -> Array<Int> = {
        myArray
    }
    return retunArrayFun

}
