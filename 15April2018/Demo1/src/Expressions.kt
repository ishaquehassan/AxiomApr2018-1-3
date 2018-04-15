fun main(args: Array<String>) {
    val sum = mySum(10,30)
    //val sumHere = if (10 > 30) 10 else 30
    println("Sum is $sum")

    val v1 = 10
    val v2 = 20
    println("Max is ${max(v1,v2)}")
}

fun mySum(n1:Int,n2:Int) : Int = n1+n2

fun max(n1: Int,n2: Int) : Int = if(n1 > n2) n1 else n2

fun maxSimple(n1: Int,n2: Int) : Int{
    if(n1 > n2){
        return n1
    }else{
        return n2
    }
}