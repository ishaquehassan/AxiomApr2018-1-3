package com.axiom.demospring.controller

import com.axiom.demospring.model.Courses
import com.axiom.demospring.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v2")
class courseController {
    @Autowired
    lateinit var userService: UserService
    @PostMapping("/course/add/{uuid}")
    fun addCourse(@PathVariable("uuid" )id:Long,@RequestBody() course:Courses): String {
      return  userService.addCourse(id,course)
    }
}