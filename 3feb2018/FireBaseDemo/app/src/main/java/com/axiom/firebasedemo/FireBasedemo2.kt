package com.axiom.firebasedemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.Toast
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_fire_basedemo2.*

class FireBasedemo2 : AppCompatActivity() {

    private lateinit var databaseRef: DatabaseReference
    private var studentList = ArrayList<Student>()


    private lateinit var view_adapter: StudentListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fire_basedemo2)
        databaseRef = FirebaseDatabase.getInstance().reference


        //RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        view_adapter = StudentListAdapter(this, studentList)
        recyclerView.adapter = view_adapter

        btn_send.setOnClickListener {
            val userName = name_et.text.toString()
            val rollnO = rollNo_et.text.toString()
            val age = age_et.text.toString().toInt()
            val key = databaseRef.child("Students").push().key
            sendUsertoDB(Student(userName, rollnO, age, key!!))

        }

        fetchDataFromDB()

    }

    private fun fetchDataFromDB() {
        databaseRef.child("Students").addChildEventListener(object : ChildEventListener {
            override fun onCancelled(p0: DatabaseError) {
            }

            override fun onChildMoved(p0: DataSnapshot, p1: String?) {
            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, p1: String?) {
                if (dataSnapshot != null) {
                    val student = dataSnapshot.getValue(Student::class.java)
                    studentList.forEachIndexed { index, studentObj ->

                        if (studentObj.equals(student)) {
                            println("MATCHED")
                            studentList[index] = student
                            view_adapter.notifyDataSetChanged()

                        } else {
                            println("NOT MATCHED")
                        }
                    }
                }
            }

            override fun onChildAdded(dataSnapshot: DataSnapshot, p1: String?) {
                if (dataSnapshot != null) {
                    val student = dataSnapshot.getValue(Student::class.java)
                    println(student.toString())
                    studentList.add(student!!)
                    view_adapter.notifyDataSetChanged()

                }
            }

            override fun onChildRemoved(dataSnapshot: DataSnapshot) {

                if (dataSnapshot != null) {
                    val student = dataSnapshot.getValue(Student::class.java)
                    var position:Int = 0

                    studentList.forEachIndexed { index, studentObj ->

                        if (studentObj.equals(student)) {
                            println("MATCHED")
                            position = index
                        } else {
                            println("NOT MATCHED")
                        }
                    }
                    studentList.removeAt(position)
                    view_adapter.notifyDataSetChanged()

                }
            }
        })
    }

    private fun sendUsertoDB(student: Student) {
        databaseRef.child("Students").child(student.id).setValue(student)
            .addOnSuccessListener {
                name_et.setText("")
                rollNo_et.setText("")
                age_et.setText("")
            }.addOnFailureListener {
                Toast.makeText(this@FireBasedemo2, "Data does not written in DB", Toast.LENGTH_LONG).show()
            }
    }
}
