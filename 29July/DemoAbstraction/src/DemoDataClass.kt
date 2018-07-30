fun main(args: Array<String>) {
    var demoClass=demoClass("kotlin",5)
    var demoClass2=demoClass
    println(demoClass.toString())
    println(demoClass.equals(demoClass2))

}

data class demoClass(var name :String,var age:Int){

//    override fun toString(): String {
//        return "demoClass(name='$name', age=$age)"
//    }
//
//    override fun equals(other: Any?): Boolean {
//        n
//    }

}