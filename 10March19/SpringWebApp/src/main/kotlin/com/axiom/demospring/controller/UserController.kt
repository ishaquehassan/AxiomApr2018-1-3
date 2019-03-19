package com.axiom.demospring.controller

import com.axiom.demospring.model.Users
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/user")
class UserController {
    var users =ArrayList<Users>()

    @PostMapping("/add")
    fun addUser(@RequestBody user: Users):ArrayList<Users>{
        users.add(user)
        return users
    }
    @GetMapping("/getAll")
    fun getAll():ArrayList<Users>{
        return users
    }
}