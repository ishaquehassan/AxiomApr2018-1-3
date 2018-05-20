
infix fun Int.add(a:Int):Int{
return this+a
}
operator infix fun String.minus(m:String):String{

    println(this)
    println(m)
    return this +m

}
infix fun Int.plus(a:Int):Int{
    println("plus")
    return this+a
}
fun main(args: Array<String>) {

    var b=33

    println("abs " -  "xyz")
    println(b plus 10)

    println(b add 22)

    var m="m"
    var n="n"
    (m+n)

}