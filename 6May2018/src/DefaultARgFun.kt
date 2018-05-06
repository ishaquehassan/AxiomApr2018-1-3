fun main(args: Array<String>) {

    defaultArg("Ali","Kamran")
    namedArgFun("abc",email = "abc@g.com")
    namedArgFun("abc")



    namedArgFun()

}




fun namedArgFun(firsname:String = "",lastname:String = "") {
    println("WIth ARg")
}
fun namedArgFun() {
    println("WIthout ARg")
}

fun namedArgFun(firsname:String,lastname:String = "",email:String) {

}

fun defaultArg(last:String,first:String = ""){
    println("first $first , last $last")
}