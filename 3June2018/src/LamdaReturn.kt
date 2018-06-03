fun main(args: Array<String>) {
 var lamda1:(Int,Int)->Int={a,b ->

     println(a)
     println(b)
     var c=a+b;
     a+b
 }
                            //5
   var returnValue= lamda1(2,3)
    println(returnValue)
//              11
    println(lamda1(5,6))
    println()
    highOrder(10,lamda1)
    highOrder(22,{x,y->
        x-y
    })
}

fun highOrder(a:Int,function1:(Int,Int)->Int){

   var value= function1(a,a)
    println(value)
}
