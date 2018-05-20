fun main(args: Array<String>) {
    var myarray = intArrayOf(2,3,4,1,5,2,6,8,9,12)
    for (i in myarray) {
        print(i)
    }
    println()
    val arrayFun = arrayFun(myarray)
    for (i in arrayFun) {
        print(i)
    }

    myarray.map {  }.forEach {  }
    myarray.forEach {
        it+5
    }
    println()
    for (i in myarray) {
        print(" $i")
    }

}
fun arrayFun(myarray:IntArray):IntArray{

    for ((index,value) in myarray.withIndex()) {
        myarray[index] = value+2
    }

    return myarray

}