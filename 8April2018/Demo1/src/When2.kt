fun main(args: Array<String>) {
    var myInt = 31
    when(myInt){
        10,30 -> {
            println("in 10 or 30")
        }
        !in 1..20 -> {
            println("Not in 1 to 20")
        }
    }

    var myStr: String = "d"

    when (myStr){
        in "Hello","world"->{
            println("found in hello")
        }
        in "byd" -> {
            println("not match")
        }
    }


    var myStr1: String = "d"
    var myStr2: String = "e"

    when{
        myStr2 in "hello" ->{
            println("hello found")
        }
        myStr1 in "world" -> {
            println("world found")
        }
    }
}











