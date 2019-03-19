package com.axiom.demospring.repository

import com.axiom.demospring.model.Courses
import org.springframework.data.jpa.repository.JpaRepository


interface courseRepositoory : JpaRepository<Courses,Long>{
}