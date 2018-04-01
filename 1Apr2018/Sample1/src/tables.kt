fun main(args: Array<String>) {
    val tableOf = 2
    val tableLength = 10
    val mul  = tableOf * tableLength
    val tableStart = 2


    for (tableVal in tableStart until tableLength){
        //println(tableOf.toString()+" X "+tableVal.toString()+" = "+(tableOf*tableVal))
        println("$tableOf X $tableVal = ${tableOf*tableVal}")
    }

    for (tableItem in 10 downTo 1 step 2){
        println("$tableItem")
    }
}