fun String.printThis(){
    println(this)
}

fun main(args: Array<String>) {

    var name: String = " AXIOM"
    name.printThis()


    var myName : String = "KAMRAN"
    val removeIndex = myName.removeIndex()
    println(removeIndex)


    println("length of myName ${myName.length}")



}

fun String.removeIndex():String{
    val subSequence = this.subSequence(0, this.length - 1)
    return subSequence.toString()
}
