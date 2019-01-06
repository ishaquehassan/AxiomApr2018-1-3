package com.axiom.quizdemo.fragments


import android.content.SharedPreferences
import android.os.Bundle
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
class SignUpFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sign_up, container, false)
        initViews(view)
        return view

    }

    private fun initViews(view: View) {
        val email = view.findViewById<EditText>(R.id.email)
        val name = view.findViewById<EditText>(R.id.name)
        val password = view.findViewById<EditText>(R.id.password)
        val sign_up_btn = view.findViewById<Button>(R.id.sign_up_btn)
        sign_up_btn.setOnClickListener {
            if (!name.text.trim().isEmpty()) {
                if (!email.text.trim().isEmpty()) {
                    if (!password.text.trim().isEmpty()) {
                        SignUp(User(email.text.toString(),name.text.toString(),password.text.toString()))
                        name.setText("")
                        email.setText("")
                        password.setText("")
                    } else {
                        password.setError("Invalid Input")
                    }
                } else {
                    email.setError("Invalid Input")
                }
            } else {
                name.setError("Invalid Input")

            }
        }

    }

    private fun SignUp(user:User) {
        val sharedPreferences = activity?.getSharedPreferences("App", 0)
        val gson =Gson()
        val editer = sharedPreferences?.edit()
        val userStringObj = gson.toJson(user)

        val userStringSet = sharedPreferences?.getStringSet("users", null)
        if(userStringSet!=null){
            userStringSet.forEach {
                val userObj = gson.fromJson(it, User::class.java)
                if(user.email.equals(userObj.email)){
                    Toast.makeText(activity, "User Exist",Toast.LENGTH_SHORT).show()
                    return
                }
            }
            userStringSet.add(userStringObj)
            editer?.putStringSet("users",userStringSet )
            editer?.apply()
            Toast.makeText(activity, "User added Succesfully",Toast.LENGTH_SHORT).show()

            //saads logic
//         if(userStringSet.contains(userStringObj)){
//             Toast.makeText(activity, "User Exist",Toast.LENGTH_SHORT).show()
//         }else{
//             userStringSet.add(userStringObj)
//             editer?.putStringSet("users",userStringSet )
//             editer?.apply()
//             Toast.makeText(activity, "User Added Succesfully",Toast.LENGTH_SHORT).show()
//
//         }
        }else{
            val hashSet = HashSet<String>()
            hashSet.add(userStringObj)
            editer?.putStringSet("users",hashSet )
            editer?.apply()
            Toast.makeText(activity, "User Added Succesfully",Toast.LENGTH_SHORT).show()

        }








    }
}// Required empty public constructor
