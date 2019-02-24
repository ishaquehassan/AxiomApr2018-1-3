package com.axiom.chatappdemo.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.axiom.chatappdemo.R
import com.axiom.chatappdemo.Utils.AppPref
import com.axiom.chatappdemo.dashboard.DashBoardActivity
import com.axiom.chatappdemo.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import kotlinx.android.synthetic.main.fragment_sign_in.view.*

class SignInFragment : Fragment() {
    val mAuth = FirebaseAuth.getInstance()
    val mDatabase = FirebaseDatabase.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {

        val sign_in_email = view.sign_in_email
        val sign_in_password = view.sign_in_password
        view.sign_in_btn.setOnClickListener {
            if (sign_in_email.text.isNullOrEmpty()) {

                sign_in_email.setError(" Invalid Field")
                return@setOnClickListener
            }
            if (sign_in_password.text.isNullOrEmpty()) {

                sign_in_password.setError(" Invalid Field")
                return@setOnClickListener
            }

            signInUser(sign_in_email.text.toString(), sign_in_password.text.toString())


        }
    }

    private fun signInUser(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password).addOnSuccessListener {
            mDatabase.reference.child("myUsers").child(it.user.uid)
                .addListenerForSingleValueEvent(object : ValueEventListener {
                    override fun onCancelled(p0: DatabaseError) {

                    }

                    override fun onDataChange(dataSnapshot: DataSnapshot) {
                        if (dataSnapshot.exists()) {
                            val user = dataSnapshot.getValue(User::class.java)
                            if (user != null) {
                                AppPref(activity!!).setUser(user)
                                Toast.makeText(activity, "Sign In successful", Toast.LENGTH_SHORT).show()
                                startActivity(Intent(activity, DashBoardActivity::class.java))
                                activity?.finish()
                            }

                        } else {
                            Toast.makeText(activity, "User not found", Toast.LENGTH_SHORT).show()

                        }
                    }
                })


        }.addOnFailureListener {
            Toast.makeText(activity, "Sign In Failure", Toast.LENGTH_SHORT).show()
            it.printStackTrace()

        }
    }

}