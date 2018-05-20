var name:String = ""
    set(value) {
        field = "xyz "+value
    }
    get() {
        return field
    }


fun main(args: Array<String>) {

    name = " KOTLIN "
    println(name)

    name = "KAMRAN"

    println(name)

    println(name.stringPrefix)

}