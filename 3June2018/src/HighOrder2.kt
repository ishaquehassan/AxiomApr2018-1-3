fun main(args: Array<String>) {
//    highORderFun({})
    highORderFun{
        println("MyLambda")
    }

    highOrderFun2(12,21){
        println("Lambda2")
    }
}

fun highORderFun(funName:()->Unit){
    funName()
}

fun  highOrderFun2(a:Int,b:Int,funName:()->Unit){
    println(a)
    println(b)
    funName()
}