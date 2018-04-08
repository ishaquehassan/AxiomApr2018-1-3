fun main(args: Array<String>) {
    var hello:Any = "Hello"
    hello = 5
    when(hello){
        is String ->{
            println("Found String ${hello.length}")
        }
        is Int -> {
            println("Found Int ${hello + 2}")
        }
        is Char ->{
            println("Found Char")
        }
    }
}