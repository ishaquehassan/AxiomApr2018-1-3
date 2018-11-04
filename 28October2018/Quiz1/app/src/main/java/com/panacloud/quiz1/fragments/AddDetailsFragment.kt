package com.panacloud.quiz1.fragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

import com.panacloud.quiz1.R
import com.panacloud.quiz1.interfaces.FragmentOneInteraction
import com.panacloud.quiz1.models.User


class AddDetailsFragment : Fragment() {

    var interaction: FragmentOneInteraction? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_details, container, false)

        val firstName = view.findViewById<EditText>(R.id.edit_firstName)
        val lastName = view.findViewById<EditText>(R.id.edit_lastName)
        val reg_num = view.findViewById<EditText>(R.id.edit_reg_num)
        val groupOfStudy = view.findViewById<EditText>(R.id.edit_group)
        val addUserButton = view.findViewById<Button>(R.id.add_user_btn)


        addUserButton.setOnClickListener {

            //            if (!firstName.text.isEmpty()) {
//
//            } else {
//                firstName.setError("Insert first Name")
//            }
//
//            if (!lastName.text.isEmpty()) {
//
//            } else {
//                lastName.setError("Insert Last Name")
//            }
//


            if (!firstName.text.isEmpty()) {

                if (!lastName.text.isEmpty()) {

                    if (!reg_num.text.isEmpty()) {
                        if (!groupOfStudy.text.isEmpty()) {
//ADD USer
                            var currUser = User(
                                    "${firstName.text.toString()} ${lastName.text}",
                                    reg_num.text.toString().toInt(), groupOfStudy.text.toString())
//                            Toast.makeText(activity!!, currUser.toString(), Toast.LENGTH_SHORT).show()

                            if (interaction != null) {
                                interaction?.sendData(currUser)
                                groupOfStudy.setText("")
                                firstName.setText("")
                                lastName.setText("")
                                reg_num.setText("")

                            }
                            var name1 = "Harris"
                            var name2 = "Harris"

                            if(name1==name2){
                                Toast.makeText(activity,"true", Toast.LENGTH_SHORT).show()
                            }else{

                            }

                        } else {
                            groupOfStudy.setError("Insert Group of Study")
                        }

                    } else {
                        reg_num.setError("Insert Reg Number")
                    }

                } else {
                    lastName.setError("Insert Last Name")
                }

            } else {
                firstName.setError("Insert first Name")
            }


        }


        return view
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        try {
            interaction = context as FragmentOneInteraction

        } catch (e: Exception) {

            Toast.makeText(activity!!, "Can not cast Interface", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDetach() {
        super.onDetach()
        interaction = null
    }


}
