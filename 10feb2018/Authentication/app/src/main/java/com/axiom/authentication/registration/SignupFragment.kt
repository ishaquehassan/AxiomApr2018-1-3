package com.axiom.authentication.registration


import android.app.ProgressDialog
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast

import com.axiom.authentication.R
import com.axiom.authentication.dashboard.todo.DashBoardActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.fragment_signup.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SignupFragment : Fragment() {
    private lateinit var auth: FirebaseAuth
    private lateinit var progress: ProgressDialog

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_signup, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        auth = FirebaseAuth.getInstance();
        progress = ProgressDialog(activity)

        btn.setOnClickListener {
            progress.show()
            registerEmail(email.text.toString(), pass.text.toString())
        }

        signin.setOnClickListener {
            activity!!.supportFragmentManager.popBackStack()
        }
    }


    private fun registerEmail(email: String, pass: String) {
        if (email != "" && pass != "") {
            auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener {
                if (it.isSuccessful) {
                    progress.dismiss()
                    Toast.makeText(activity, "Success", Toast.LENGTH_LONG).show()
                    val authResult = it.result
                    authResult?.user?.uid
                    startActivity(Intent(activity, DashBoardActivity::class.java))
                } else {
                    progress.dismiss()
                }
            }
        }
    }

}
