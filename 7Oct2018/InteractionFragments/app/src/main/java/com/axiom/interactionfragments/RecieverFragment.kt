package com.axiom.interactionfragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_reciever.view.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class RecieverFragment : Fragment() {
//    override fun changeText(text: String) {
//        view1.tv1.setText(text)
//    }


    private var param1: String?=""
//    var context :Context?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
       //     param2 = it.getString(ARG_PARAM2)
        }
    }
    lateinit var view1: View
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        view1 = inflater.inflate(R.layout.fragment_reciever, container, false)
        return view1
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) {

        }
//                RecieverFragment.apply {
//                   arguments =Bundle().apply {
//                        putString(ARG_PARAM1, param1)
//                        putString(ARG_PARAM2, param2)
//                    }
//                }


    }

}
