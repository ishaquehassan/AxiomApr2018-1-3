


//infix
fun add (a:Int ,b:Int){


}
infix fun Int.add(b:Int):Int{


    return this + b
}

fun main(args: Array<String>) {
    var a = 12


    var b =10 + 12

    a.add(13)
    println(a add 10)

//     - + * /
    println(a plus 10)
    
    var value = "sad"
    var value1 = "sad"

    println(value - value1)
}

operator infix fun Int.plus(b:Int):Int{
    return this - b
}
operator infix fun String.minus(b:String):String{
    return this + b
}