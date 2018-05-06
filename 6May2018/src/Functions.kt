fun main(args: Array<String>) {

    var a = "Kamran"
    myFunction()
    paramertrized("KAMRAN",10)
    defaultArgumentFUN("ali")
}
fun defaultArgumentFUN(first:String = ""){

    println("Name is $first")
}
fun paramertrized(a:String,b:Int){
    println("a $a , b $b")
}
fun myFunction(){
    println("KAMRAN")

}