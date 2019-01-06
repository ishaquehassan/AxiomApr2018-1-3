package com.axiom.quizdemo.fragments


import android.os.Bundle
import android.provider.ContactsContract
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.axiom.quizdemo.R
import com.axiom.quizdemo.model.User
import com.google.gson.Gson


/**
 * A simple [Fragment] subclass.
 */
class SignInFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_sign_in, container, false)
        initViews(view)
        return view

    }

    private fun initViews(view: View) {
       val email=   view.findViewById<EditText>(R.id.email)
       val password=   view.findViewById<EditText>(R.id.password)
       val sign_in_btn=   view.findViewById<Button>(R.id.sign_in_btn)
        sign_in_btn.setOnClickListener {
            if(!email.text.trim().isEmpty()){
                if(!password.text.trim().isEmpty()){
                    Login(email.text.trim().toString(),password.text.trim().toString())
                }else{
                    password.setError("Invalid Input")
                }
            }else{
                email.setError("Invalid Input")
            }
        }

    }

    private fun Login(email: String, password: String) {
        val sharedPreferences = activity?.getSharedPreferences("App", 0)
        val gson = Gson()
//        val editer = sharedPreferences?.edit()
        val userStringSet = sharedPreferences?.getStringSet("users", null)
        if(userStringSet!=null){
            userStringSet.forEach {
                val user = gson.fromJson(it, User::class.java)
                if(user.email.equals(email)&& user.password.equals(password)){
                    Toast.makeText(activity, "user Sign in Succesfully", Toast.LENGTH_SHORT).show()
                    //intent
                    return
                }
            }
            Toast.makeText(activity, "user don't exist", Toast.LENGTH_SHORT).show()

        }else
            Toast.makeText(activity, "user don't exist", Toast.LENGTH_SHORT).show()

    }

}// Required empty public constructor
