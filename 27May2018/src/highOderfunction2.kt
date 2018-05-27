fun main(args: Array<String>) {
    funcForArray(intArrayOf(1,2,3,4), {
        println(it+2)
    })
    println()
    funcForArray(intArrayOf(1,2,3,4),{
        println(it-2)
    })
    println()
    funcForArray(intArrayOf(1,2,3,4),{
        println(it*2)
    })
}
fun funcForArray (array:IntArray,function:(Int)->Unit){

    for (i in array) {
        function(i)
    }

}