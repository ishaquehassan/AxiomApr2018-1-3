fun main(args: Array<String>) {

    var object1= RefClass()
    var object2= RefClass()
    var object3=object1//you can not use clone here

    object1.name="Kotlin"
    object2.name="Kotlin2"
//    object3.name="Kotlin3"

    println(object1.name)//kotlin
    println(object2.name)//kotlin2
    println(object3.name)//kotlin3

    var a:Int=5
    var b=a
    a=6
    println(a)
    println(b)

    var str1="Java"
    var str2=str1
    str1="kotlin"
    println(str1)//kotlin
    println(str2)//java

    var arr1= arrayListOf<Int>(1,2,4,43)
    var arr2=arr1
//    var arr2=arr1.clone()//copy
    arr1.add(3)
    println(arr1)//1,2,4,43,3
    println(arr2)//1,2,4,43
}
class RefClass(){
    var name:String=""

}