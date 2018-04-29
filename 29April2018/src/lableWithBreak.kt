fun main(args: Array<String>) {

    var a=0;

    label@ for (a in 1..5){
        println("first loop $a")

        for (b in 1..5){

            println(" before inner loop $b")

            if (b == 2){
                break@label
            }
            println(" after inner loop $b")
        }
        println("OUTEr body of LOOP $a")

    }
}