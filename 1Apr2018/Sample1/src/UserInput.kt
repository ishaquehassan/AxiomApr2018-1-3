fun main(args: Array<String>) {
    print("Enter Your Name : ")
    val myName = readLine()
    val sum = myName!!.toInt() + 5
    println("Your name is $myName")
    println("Sum : $sum")
}