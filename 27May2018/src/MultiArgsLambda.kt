fun main(args: Array<String>) {

    val lambda = { a: Int, b: String, c: Double ->

        println("Sum of a b and c is = ${(a + c)} $b")
    }
    lambda(12, "String", 10.0)


    val lambda1: (Int, String, Double) -> String = { a, b, c ->
        val d = a + c
        println(d)
        println(b)

        b
    }

    val lambda11 = lambda1(12, "Lambda", 10.1)
    println(lambda11)



    val lastLambda:(a:Int)-> Int = {
        println(it+222)

        it+222
    }

    lastLambda(1111)




}
