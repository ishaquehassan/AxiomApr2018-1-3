fun main(args: Array<String>) {

    val myVar:String = "20"

    val myLambda: () -> Unit = {
        println("Lmbda Fun")
    }

    println(myVar)

    myLambda.invoke()

    val mylambda1:(a:Int) -> Unit = {s ->
        println("Value of s = $s")
    }

    mylambda1(10)




}
fun myFun(a:Int){
    println(a)
}