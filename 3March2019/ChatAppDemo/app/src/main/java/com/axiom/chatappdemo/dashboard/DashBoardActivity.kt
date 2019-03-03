package com.axiom.chatappdemo.dashboard

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.axiom.chatappdemo.R
import com.axiom.chatappdemo.adapter.UsersListAdapter
import com.axiom.chatappdemo.model.User
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.InstanceIdResult
import kotlinx.android.synthetic.main.activity_dash_board.*

class DashBoardActivity : AppCompatActivity() {
    val userList = ArrayList<User>()
    val mAuth = FirebaseAuth.getInstance()

    lateinit var usersListAdapter: UsersListAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)
        recyclerView.layoutManager = LinearLayoutManager(this@DashBoardActivity)
        usersListAdapter = UsersListAdapter(this, userList) {
            val intent = Intent(
                this@DashBoardActivity,
                ChatListActivity::class.java
            )
            intent.putExtra("user", it)
            startActivity(intent)
        }
        recyclerView.adapter = usersListAdapter
        getUsers()
        getFcm()
    }

    private fun getFcm() {
        val token = FirebaseInstanceId.getInstance().instanceId.addOnCompleteListener(object :
            OnCompleteListener<InstanceIdResult> {
            override fun onComplete(task: Task<InstanceIdResult>) {
                if (!task.isSuccessful) {
                    Toast.makeText(this@DashBoardActivity, "unable to get Fcm", Toast.LENGTH_SHORT).show()
                    return
                }
                val token = task.result!!.token
                Log.d("FCM", token)
                sendTokenToServer(token)

            }
        })

    }

    private fun sendTokenToServer(token: String) {
        FirebaseDatabase.getInstance().getReference()
            .child("myUsers")
            .child(FirebaseAuth.getInstance().currentUser?.uid!!)
            .child("fcm").setValue(token)

    }

    fun getUsers() {
        FirebaseDatabase.getInstance()
            .getReference().child("myUsers")
            .addChildEventListener(object : ChildEventListener {
                override fun onCancelled(p0: DatabaseError) {
                }

                override fun onChildMoved(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildChanged(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildAdded(datasnapshot: DataSnapshot, p1: String?) {
                    if (datasnapshot.exists()) {
                        val user = datasnapshot.getValue(User::class.java)
                        if (user != null) {
                            if (!user.uuid.equals(mAuth.currentUser?.uid)) {
                                userList.add(user)
                                usersListAdapter.notifyDataSetChanged()
                            }
                        }
                    }
                }

                override fun onChildRemoved(p0: DataSnapshot) {
                }
            })
    }
}
