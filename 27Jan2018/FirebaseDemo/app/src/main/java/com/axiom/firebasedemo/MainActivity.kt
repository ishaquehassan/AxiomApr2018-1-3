package com.axiom.firebasedemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var database: FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        database = FirebaseDatabase.getInstance()
        val databaseReference = database.reference

        //GetData with Single value Event
        databaseReference.child("Name")
            .addListenerForSingleValueEvent(object : ValueEventListener {
                override fun onCancelled(p0: DatabaseError) {
                }

                override fun onDataChange(dataSnapshot: DataSnapshot) {
                    println("KEY: ---- " + dataSnapshot.key)
                    println("VALUE: ---- " + dataSnapshot.value.toString())
                    val data = "VALUE = ${dataSnapshot.value.toString()} KEY= ${dataSnapshot.key}"
                    value_tv.text = data
                }
            })

        //VAlue Event Listener
        databaseReference.child("Name").addValueEventListener(object : ValueEventListener {
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onDataChange(dataSnapshot: DataSnapshot) {
                println("KEY: ---- " + dataSnapshot.key)
                println("VALUE: ---- " + dataSnapshot.value.toString())
                val data = "VALUE2 = ${dataSnapshot.value.toString()} KEY2 = ${dataSnapshot.key}"
                value_tv2.text = data
            }
        })
        btn1.setOnClickListener {
            val name = name_et.text.toString()
            databaseReference.child("Name").setValue(name)
            name_et.setText("")
        }


    }
}
