fun main(args: Array<String>) {
    fun isOdd(x: Int) = x % 2 != 0

    var myList = listOf(1,2,3,4,5,6,7,8,9)

    val filter = myList.filter(::isOdd)
    filter.forEach {
        println(it)
    }

}

