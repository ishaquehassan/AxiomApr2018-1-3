package com.axiom.demospring.model

import com.fasterxml.jackson.annotation.JsonIgnore
import javax.persistence.*


@Entity
class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var idcourse:Long?=null
    var name:String=""
    @OneToOne(cascade = arrayOf(CascadeType.ALL), fetch = FetchType.EAGER)
    @JoinColumn(name = "id")
    @JsonIgnore
    var users: Users? = null
}