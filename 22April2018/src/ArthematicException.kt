fun main(args: Array<String>) {

    var a:Int =5;
    var b:Int=0;

    try {
        val i = a / b
        println(i)

    }catch (exe :Exception){


println("Arthematic Exception")
    }finally {
        println("finally code run")
    }

}