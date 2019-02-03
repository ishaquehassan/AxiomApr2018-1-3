package com.axiom.firebasedemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.database.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private var databaseRef: DatabaseReference? = null
    private var stringArrayList = ArrayList<String>()

    private lateinit var view_adapter: MyRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        databaseRef = FirebaseDatabase.getInstance().reference
        val recyclerView = findViewById<RecyclerView>(R.id.myRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        view_adapter = MyRecyclerAdapter(this, stringArrayList)
        recyclerView.adapter = view_adapter


        send_btn.setOnClickListener {
            if (name_et.text != null) {
                val name = name_et.text.toString()
                sendNameToDB(name)
            }
        }

        databaseRef!!.child("Users").addChildEventListener(object : ChildEventListener {
            override fun onCancelled(p0: DatabaseError) {

            }

            override fun onChildMoved(p0: DataSnapshot, p1: String?) {
            }

            override fun onChildChanged(dataSnapshot: DataSnapshot, p1: String?) {
                if (dataSnapshot!=null){
                    println("CHANGED : "+dataSnapshot.child("name").getValue().toString())
//                    val s = dataSnapshot.child("name").getValue().toString()
//
//                    stringArrayList.add(s)
//                    view_adapter.notifyDataSetChanged()
                }
            }

            override fun onChildAdded(dataSnapshot: DataSnapshot, p1: String?) {
                if (dataSnapshot != null) {
                    println("KEY: " + dataSnapshot.key)
                    println("VALUE: " + dataSnapshot.value.toString())
                    val s = dataSnapshot.child("name").getValue().toString()
                    stringArrayList.add(s)
                    view_adapter.notifyDataSetChanged()
                }

            }

            override fun onChildRemoved(p0: DataSnapshot) {
            }
        })

    }

    private fun sendNameToDB(name: String) {

        databaseRef!!.child("Users").push()
            .child("name").setValue(name)
            .addOnSuccessListener {
                name_et.setText("")
            }.addOnFailureListener {

            }
    }
}
