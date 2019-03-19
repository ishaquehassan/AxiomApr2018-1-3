package com.axiom.demospring.model

import javax.persistence.*


@Entity
class Users() {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Long?=null
    var name:String=""
    var age:String=""

    @OneToOne(mappedBy = "users",cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
    var courses:Courses?=null

}