fun main(args: Array<String>) {
    //println("Hello World")
    val a = 10
    val b = 20

    val c = a + b
    //println("Sum of a + b is $c")
    simple()
    sum()

    sumWithValues(10,20)
    val mySum = sumWithReturn(20,30)
    println("My Sum is $mySum")
    println("My Sum is ${sumWithReturn(20,30)}")


}

fun simple(){
    println("Sum Function Called")
}

fun sum(){
    val a = 30
    val b = 40
    println("Sum is ${a+b}")
}

fun sumWithValues(num1:Int,num2:Int){
    println("Sum of passed values = ${num1+num2}")
}

fun sumWithReturn(n1:Int,n2:Int) : Int {
    return n1+n2
}


















