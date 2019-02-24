package com.axiom.chatappdemo.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.axiom.chatappdemo.R
import com.axiom.chatappdemo.model.User
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignUpFragment : Fragment() {
    val mAuth = FirebaseAuth.getInstance()
    val mDatabase = FirebaseDatabase.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)

        initView(view)
        return view
    }


    private fun initView(view: View) {

        val sign_up_email = view.sign_up_email
        val sign_up_password = view.sign_up_password
        val sign_up_name = view.sign_up_name
        view.sign_up_btn.setOnClickListener {
            if (sign_up_email.text.isNullOrEmpty()) {

                sign_up_email.setError(" Invalid Field")
                return@setOnClickListener
            }
            if (sign_up_password.text.isNullOrEmpty()) {

                sign_up_password.setError(" Invalid Field")
                return@setOnClickListener
            }
            if (sign_up_name.text.isNullOrEmpty()) {

                sign_up_name.setError(" Invalid Field")
                return@setOnClickListener
            }

            signUpUser(sign_up_email.text.toString(), sign_up_name.text.toString(), sign_up_password.text.toString())


        }
    }

    private fun signUpUser(email: String, name: String, password: String) {
        mAuth.createUserWithEmailAndPassword(email, password).addOnSuccessListener {
            val uid = it.user.uid
            val user = User(name, email, password, uid)
            mDatabase.getReference().child("myUsers").child(uid).setValue(user).addOnSuccessListener {
                Toast.makeText(activity, "Sign up successful", Toast.LENGTH_SHORT).show()
                mAuth.signOut()
            }.addOnFailureListener {
                Toast.makeText(activity, "Sign up Failed", Toast.LENGTH_SHORT).show()
                it.printStackTrace()

            }
        }
    }
}