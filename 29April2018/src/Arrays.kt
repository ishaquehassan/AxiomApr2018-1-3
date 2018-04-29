fun main(args: Array<String>) {

    var myArray = Array(10,init = {100})
    myArray.set(0,90)
    myArray.set(0,90)
    myArray.set(0,90)
    myArray.set(0,90)
    myArray.set(0,90)
    myArray.set(0,90)


    for (a in myArray){
        println("array value $a")
    }

    for ((a,v) in myArray.withIndex()){
        println("index $a  value $v")
    }

}