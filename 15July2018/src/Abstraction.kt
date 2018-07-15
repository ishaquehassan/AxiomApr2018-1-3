fun main(args: Array<String>) {

    var classA=A()
    classA.fun1()
    classA.fun2()
}
abstract class  absClass(){
  abstract fun fun1()//abstract funtion
  open fun fun2(){}//simple function
}
class A :absClass(){
    override fun fun1() { //abstract body
        println("this is a abstract function")
    }
    override fun fun2(){}
}
