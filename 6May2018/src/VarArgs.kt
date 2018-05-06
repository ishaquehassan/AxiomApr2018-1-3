fun main(args: Array<String>) {
    val arrayOf = arrayOf("a", "asd", "asd", "asd", "Sd")


    varArgs("a","b",*arrayOf,"c","sd",b = 10)

//    varArgs(1,2,3,4,78,89,0)
}

fun varArgs(vararg a:String,b:Int){
    for (i in a) {

        println("VAlue of a is $i")
    }
    println("B $b")
}
fun varArgs(vararg a:String){
    for (i in a) {
        println("VAlue of a is $i")
    }
}