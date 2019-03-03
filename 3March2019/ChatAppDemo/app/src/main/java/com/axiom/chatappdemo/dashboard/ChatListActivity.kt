package com.axiom.chatappdemo.dashboard

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.axiom.chatappdemo.R
import com.axiom.chatappdemo.Utils.AppPref
import com.axiom.chatappdemo.adapter.UsersChatListAdapter
import com.axiom.chatappdemo.model.MessageChat
import com.axiom.chatappdemo.model.User
import com.google.firebase.database.ChildEventListener
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_chat_list.*

class ChatListActivity : AppCompatActivity() {
    private lateinit var mAdapter: UsersChatListAdapter
    var userChatList: ArrayList<MessageChat> = ArrayList()
    lateinit var user: User
    override fun onStart() {
        super.onStart()

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chat_list)
        if (intent != null && intent.extras != null) {
            val extras = intent.extras
            user = extras.getSerializable("user") as User
        } else {
            finish()
        }
        if (user != null) {
            Toast.makeText(this@ChatListActivity, user.name, Toast.LENGTH_SHORT).show()
        }


        user_chat_rv.layoutManager = LinearLayoutManager(this@ChatListActivity)
        mAdapter = UsersChatListAdapter(this@ChatListActivity, userChatList)
        user_chat_rv.adapter = mAdapter
        recieveMsg()


        send_msg.setOnClickListener {
            if (!msg_text.text.isEmpty()) {
                val currentUser = AppPref(this@ChatListActivity).getUser()
                var chatId = user.uuid + "-" + currentUser?.uuid
                val list = chatId.split("-")
                val sorted = list.sorted()
                chatId = sorted[0] + "-" + sorted[1]
                val msgID = System.currentTimeMillis().toString()
                val messageChat = MessageChat(
                    chatId,
                    msg_text.text.toString().trim(),
                    System.currentTimeMillis(),
                    msgID,
                    currentUser?.uuid!!
                )
                FirebaseDatabase.getInstance().getReference().child("user-chat").child(chatId).child(msgID)
                    .setValue(messageChat)
                msg_text.setText("")
            }
        }
    }

    private fun recieveMsg() {
        val currentUser = AppPref(this@ChatListActivity).getUser()
        var chatId = user.uuid + "-" + currentUser?.uuid
        val list = chatId.split("-")
        val sorted = list.sorted()
        chatId = sorted[0] + "-" + sorted[1]
        FirebaseDatabase.getInstance().getReference().child("user-chat").child(chatId)
            .addChildEventListener(object : ChildEventListener {
                override fun onCancelled(p0: DatabaseError) {
                }

                override fun onChildMoved(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildChanged(p0: DataSnapshot, p1: String?) {
                }

                override fun onChildAdded(datasnapshot: DataSnapshot, p1: String?) {
                    if (datasnapshot.exists()) {
                        val value = datasnapshot.getValue(MessageChat::class.java)
                        if (value != null) {
                            userChatList.add(value)
                            mAdapter.notifyDataSetChanged()
                        }
                    }
                }

                override fun onChildRemoved(p0: DataSnapshot) {
                }
            })
    }

}
