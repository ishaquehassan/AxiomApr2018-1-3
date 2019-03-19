package com.axiom.demospring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.*

@RestController
@SpringBootApplication
class DemoSpringApplication{


@RequestMapping("/", method = [RequestMethod.GET])
fun helloWorld():String
{
    return "Hello Kotlin"
}
}
fun main(args: Array<String>) {
    runApplication<DemoSpringApplication>(*args)
}
//@GetMapping(value = )