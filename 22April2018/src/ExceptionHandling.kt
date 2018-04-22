import java.lang.System.`in`
import java.util.*

fun main(args: Array<String>) {


    val scanner = Scanner(`in`)

    try {


        println("before exception")
        val nextInt = scanner.nextInt()

        println("after exception")


    } catch (e: Exception) {

        println("throw exception")
//       e.printStackTrace()
    }

}