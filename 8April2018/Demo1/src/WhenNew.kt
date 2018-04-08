fun main(args: Array<String>) {
    var myName = "Hello"
    when(myName){
        "Abc" -> println("It is abc")
        else -> println("Its not ABC")
    }

    var score = 10
    when(score){
        in 10..20 ->{
            println("Score is between 20")
        }
        in 1..10 ->{
            println("Score is between 1 to 10")
        }
    }

}