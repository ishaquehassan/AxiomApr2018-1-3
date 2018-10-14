package com.axiom.interactionfragments


import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class SenderFragment : Fragment() {
    interface myCallback {
        fun changeText(text: String)
        fun changeBakground()
    }

    var communicator: myCallback? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_sender, container, false)


        val frag_btn1 = view.findViewById<Button>(R.id.frag_btn1)
        val edit_1 = view.findViewById<EditText>(R.id.edit_1)

        frag_btn1.setOnClickListener {

            val text = edit_1.text.toString()
            communicator!!.changeText(text)

            communicator!!.changeBakground()
        }
        return view

    }

    //
    override fun onAttach(context: Context?) {
        super.onAttach(context)

        try {
            communicator = context as myCallback
        } catch (e: ClassCastException) {
            throw ClassCastException(context.toString() + " must implement OnFragmentInteractionListener")
        }
    }


    override fun onDetach() {
        super.onDetach()
        communicator = null
    }
//    override fun onAttach(context: Context?) {
//        super.onAttach(context)
//        communicator = context as myCallback
//    }


}
