fun main(args: Array<String>) {

    val myFun1:(Int)-> ((Int)-> Unit)  ={
        {

        }
    }

    hFun({
        println("Lambda")
    })
    hFun{ println("Lambda2")}

    hFun1({
        "KOtlin"
    })

    hFun2 {

        it.toString()
    }

}

fun hFun(fName:()->Unit){
    fName()
}
fun hFun1(fName:()->String){
    val fName1 = fName()
    println(fName())
}
fun hFun2(fName:(a:Int)->String){
    fName(100)
}
