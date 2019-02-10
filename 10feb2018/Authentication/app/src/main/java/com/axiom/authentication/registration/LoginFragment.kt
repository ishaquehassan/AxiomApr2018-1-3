package com.axiom.authentication.registration


import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.Toast

import com.axiom.authentication.R
import com.axiom.authentication.dashboard.todo.DashBoardActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_login.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class LoginFragment : Fragment() {
    private lateinit var auth: FirebaseAuth
    private lateinit var progress: ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance();
        progress = ProgressDialog(activity)
        if (auth.currentUser != null) {
            startActivity(Intent(activity, DashBoardActivity::class.java))
        }

        signup.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction()
                .replace(R.id.container, SignupFragment()).addToBackStack(null).commit()
        }
        btn.setOnClickListener {
            progress.show()
            authenticatuser(email.text.toString(), pass.text.toString())
        }
    }

    private fun authenticatuser(email: String, pass: String) {
        if (!email.isNullOrEmpty() && !pass.isNullOrEmpty()) {
            auth.signInWithEmailAndPassword(email, pass).addOnSuccessListener {
                progress.dismiss()
                startActivity(Intent(activity, DashBoardActivity::class.java))
            }.addOnFailureListener {
                progress.dismiss()
                it.printStackTrace()
                Toast.makeText(activity, "Error in signin ", Toast.LENGTH_LONG).show()
            }
        } else {
            progress.dismiss()
        }

    }


}
