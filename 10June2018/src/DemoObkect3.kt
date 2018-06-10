fun main(args: Array<String>) {
//    var myDemoObject = DemoClass1("kotlin")
    var myDemoObject2 = DemoClass1(12)
    var myList=ArrayList<DemoClass1>()
    var myList1=ArrayList<Int>()
    myList.add(DemoClass1("kotlin","abc@g.com"))
    myList.add(DemoClass1("kotlin1","a@g.com"))
    myList.add(DemoClass1("kotlin2","abc@gmail.com"))

    println()
    for (i in myList) {
        println(i.name)
        println(i.email)
        println()
    }


//    println(myDemoObject)
}

class DemoClass1() {
var name:String=""
var email:String=""
constructor(name:String,email: String):this(){
    println("constructor1")
    println(name)
    this.name=name
    this.email=email
}
    constructor(age:Int):this(){
        println("constructor2")
    }
    constructor(mage:Int,age:Int):this(){
        println("constructor2")
    }

    constructor(mage:Int,email:String):this(){
        println("constructor2")
    }
}