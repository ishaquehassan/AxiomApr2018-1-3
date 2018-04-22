fun main(args: Array<String>) {
    val myArrayList = arrayListOf<Int>()
    myArrayList.add(3)
    myArrayList.add(5)
    myArrayList.add(33)
    myArrayList.add(31)
    for (i in myArrayList) {
        println(i)
    }

    println("new loop\n")
    myArrayList.add(3,99)
    for (i in myArrayList) {
        println(i)
    }
    myArrayList.add(99)

    myArrayList.remove(99)
    println("new loop\n")
    for (i in myArrayList) {
        println(i)
    }

    println("new loop")
    myArrayList.removeAt(2)
    for (i in myArrayList) {
        println(i)
    }

    

}