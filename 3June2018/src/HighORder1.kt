fun main(args: Array<String>) {
    //function1() return reference of lambda
    //function2() returns a String
    val StringREturn = function2(function1())
    println(StringREturn)

}
//Funtion1 return a refrence to Lambda funtions
fun function1(): (Int, Int) -> Int {
    //returns only a refernce of lambda it get executed on line #19
    return { a, b ->
        println(a)
        println(b)
        a + b
    }
}
//Function 2 receive lambda function and returns a String
fun function2(lmbda: (Int, Int) -> Int): String {
    //lmbda(2,10) return additio of two variables
    var returnVAlue = lmbda(2, 10)
    return returnVAlue.toString()
}