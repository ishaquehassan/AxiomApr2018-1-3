fun main(args: Array<String>) {
    var myDemoObject=demoClass("Kotlin")
   println( myDemoObject.name)
}
class demoClass(n:String){
    var name= n
init {
    println("constructor")
    this.name=n
}
}