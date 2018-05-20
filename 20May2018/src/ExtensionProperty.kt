
val String.stringPrefix:String
    get() {
        return this+" xyz"
    }

fun main(args: Array<String>) {

    var name = "Kamran"
    println(name.stringPrefix)
    println(name.length)

//    name.myFunction()
}
