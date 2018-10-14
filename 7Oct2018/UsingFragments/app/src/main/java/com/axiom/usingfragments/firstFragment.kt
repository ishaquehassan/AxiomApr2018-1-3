package com.axiom.usingfragments


import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class firstFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        Log.d("Fragment 1", "OnCreateView")

        var view = inflater.inflate(R.layout.fragment_first,
                container, false)

        val button1 = view.findViewById<Button>(R.id.f_btn_1)
        button1.setOnClickListener {
            Toast.makeText(activity,
                    "Fragment 1 Selected",
                    Toast.LENGTH_SHORT).show()
        }

        return view

    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.d("Fragment 1", "OnAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment 1", "OnCreate")

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d("Fragment 1", "OnActivityCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.d("Fragment 1", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment 1", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Fragment 1", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Fragment 1", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Fragment 1", "OnDestroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("Fragment 1", "OnDestroyView")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("Fragment 1","OnDetach")

    }
}
