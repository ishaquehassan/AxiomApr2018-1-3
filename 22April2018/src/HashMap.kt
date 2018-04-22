fun main(args: Array<String>) {
    val myMap = HashMap<Int, String>()

    myMap.put(21, "KOtlin")
    myMap.put(1, "MY KOtlin")
    myMap.put(5, "YOur KOtlin")
    myMap.put(4, "Axiom")
    myMap.put(3, "Hello")
    myMap.put(2, "World")

    for ((key, value) in myMap) {
        println("KEY= $key , value = $value")
    }
    myMap.put(1, "Hello")

    println("New Loop ")
    for ((key, value) in myMap) {
        println("KEY= $key , value = $value")
    }

    //For Sigle Value
    println(myMap.get(1))
    myMap.remove(1)

    println("AFter Remove Loop ")
    for ((key, value) in myMap) {
        println("KEY= $key , value = $value")
    }
    println(myMap.containsKey(1))


}