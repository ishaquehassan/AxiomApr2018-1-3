fun main(args: Array<String>) {
    val f1 = f1()
    val lambda = highF1()
    println(f1)
    lambda()
}
fun f1():Int{
    var a=3
    return 3
}
fun highF1():()->Unit{

    val f:()->Unit={
        println("lamda1")
    }


    return f
}