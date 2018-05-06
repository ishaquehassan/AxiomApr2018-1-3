fun main(args: Array<String>) {

    println(returnSingleValue())
    println(addition(5, 5))
    val addition = addition(10, 10)
    println(addition)
    
    check1(5)

    for (i in 1..10) {
        check1(i)
        break
    }

}

fun check1(a: Int) {
    println("a")
    println("b")
    println("c")

    if (a == 10) {
        return
    }

    println("d")
    println("e")
    println("f")

}

fun addition(a: Int, b: Int): String {
    println(a + b)
    val toString = a.toString()
    return toString + b
}

fun returnSingleValue(): Int {

    return 5
}