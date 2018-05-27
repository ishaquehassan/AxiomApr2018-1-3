fun main(args: Array<String>) {
    mFunc(8, {
        println(it)
    } )
}
fun mFunc(a:Int,myfunc:(b:Int)->Unit){
    println(a)
    myfunc(a)
}
fun m(a:Int){
    println(a)
}