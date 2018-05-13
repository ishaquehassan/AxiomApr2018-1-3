fun String.print(){
    println(this)
}

fun main(args: Array<String>) {


    val array = intArrayOf(11, 2, 42, 5, 2)
    for (i in array) {
        print(" " + i)
    }

    val swap = array.swap(0, 1)

    println()
    for (i in swap) {
        print(" "+i)
    }

    println()
    for (i in array) {
        print("$i  ")
    }

//    if (true or true){
//
//    }



}

fun IntArray.swap(index1: Int, index2: Int): IntArray {

    val temp = this[index1]
    this[index1] = this[index2]
    this[index2] = temp

    return this


}