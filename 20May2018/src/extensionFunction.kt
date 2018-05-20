 fun String.myFunction(){
     println(this)
 }

 fun String.getHalfLength():Int{
   return  this.length/2
 }
 fun Int.myPlus(newVar:Int):Int{
  return  this+newVar

 }
fun main(args: Array<String>) {
    var myString:String="xyz"
    var stringVAr="sdasas"

    var myVar=12
    println(myVar.myPlus(10))

    myString.myFunction()
    println(stringVAr.getHalfLength())

}