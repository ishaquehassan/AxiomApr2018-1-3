//group Link
//https://www.facebook.com/groups/android.panacloud/?_rdc=1&_rdr

fun main(args: Array<String>) {

    val f:(a:Int)->Unit= {
        println("LAmbda Fun")
        println(it + 10 )
    }

    var myInt = 10

    myFunc(myInt,f)

    myFunc(10,{
        println("Lambda 2")
        println(it+10)
    }
    )
}
fun myFunc(a:Int ,fname:(Int)-> Unit){
    var ab = a+10
     fname(12)

}
