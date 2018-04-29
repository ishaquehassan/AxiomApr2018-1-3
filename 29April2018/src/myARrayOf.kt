fun main(args: Array<String>) {
    var myARray = arrayOf(1,2,4,7,6)
    for (value in myARray) {

        println("value is  $value")
    }
    for ((index,value) in myARray.withIndex()){

        println("index is $index value is  $value")
    }
  var arrayNew=  intArrayOf(5,62,1,57,2)
    for (i in arrayNew) {
        println("value is $i")

    }
    
}