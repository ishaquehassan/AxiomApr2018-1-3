package com.axiom.demospring.controller

import com.axiom.demospring.model.Users
import com.axiom.demospring.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v2")
class DBController {
    @Autowired
    lateinit var userService: UserService

    @GetMapping("/getAll")
    fun getAllUsers(): List<Users> {
        return userService.getAllUsers()
    }
        @PostMapping("/addUser")
    fun  addUser(@RequestBody users: Users): String {
        return userService.addUser(users)
    }
}