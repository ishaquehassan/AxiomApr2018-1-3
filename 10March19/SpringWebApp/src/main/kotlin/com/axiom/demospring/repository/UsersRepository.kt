package com.axiom.demospring.repository

import com.axiom.demospring.model.Users
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository : JpaRepository<Users,Long>{
}