fun main(args: Array<String>) {
    val myAge = 10
    when(myAge){
        20 -> print("Age is 20")
        10 -> {
            println("Age is 10")

        }
        else -> print("No Condition Matched")
    }

    when(myAge){
        20 -> print("Age is 20")
        30 -> {
            println("Age is 10")

        }
    }
}