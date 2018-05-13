

var String.name:String
    get() {
        println(this)
        return this
    }
    set(value) {
        println("Setting value")
        value
    }

fun main(args: Array<String>) {

    var nameX = "KOTLIN"
    nameX.name = " HELLO"

    var name2 = "ABC"
    println(name2.name)

    name2.name = "newVALUE"

}