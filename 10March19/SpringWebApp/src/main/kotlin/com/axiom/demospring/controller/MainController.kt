package com.axiom.demospring.controller

import com.axiom.demospring.model.Users
import org.springframework.web.bind.annotation.*

@RestController
class MainController {
    @RequestMapping("/hello",method = [RequestMethod.GET])
    fun helloWorld(): String {
        return "Hello world"
    }
    @GetMapping("/new/{name}")
    fun function1(@PathVariable("name") a:String):String{
        return "hello $a"
    }
    @GetMapping("/f2/{value1}/{value2}")
    fun function2(@PathVariable("value1") a:Int,@PathVariable("value2") b:Int):Int{
        return a+b
    }
    @GetMapping("/user/{name}/{age}")
    fun getUser(@PathVariable("name") n:String,@PathVariable("age") a:String):Users{
        return Users().apply {
            age=a
            name=n
        }
    }


}