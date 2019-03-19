package com.axiom.demospring.service

import com.axiom.demospring.model.Courses
import com.axiom.demospring.model.Users
import com.axiom.demospring.repository.UsersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {
    @Autowired
    lateinit var usersRepository: UsersRepository


    fun getAllUsers():List<Users>{
       return usersRepository.findAll()
    }
    fun addUser(users: Users):String{
        usersRepository.save(users)
        return "user added succesfully"
    }

    fun addCourse(id: Long, course: Courses): String {
        if (usersRepository.existsById(id)) {
            val users = usersRepository.findById(id).get()
            course.users=users
            users.courses=course
            usersRepository.save(users)
            return "course added"

        }
        return "no user found"
    }
}