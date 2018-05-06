fun main(args: Array<String>) {

    for (i in 1..5){
        if (i ==3){
            continue  //break //return
        }
        println("Value of i $i")
    }
    println("after Loop")


    name@ for (i in 1..5){
        println("Outer Loop $i")

        for (a in 1..5){
            if (a == 3)
                break@name
            println("Inner Loop $a")
        }
    }
    println("After LOOP ")


}