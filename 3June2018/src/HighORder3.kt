fun main(args: Array<String>) {
    5 + 5
    myFun {
        //        this.plus(19)
        val sum = plus(19)
        println(sum)
    }

    myFun2 { b: String ->
        //        this.plus(19)
        val sum = plus(19)
        println(sum)
    }

}

fun myFun2(fName: Int.(String) -> Unit) {
    fName(20, "Kotlin")
    2.fName("Kotlin")
}

fun myFun(fName: Int.() -> Unit) {
    fName(2)
    2.fName()
}