package com.axiom.chatapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.axiom.chatapp.databinding.FragmentMainBinding
import com.axiom.chatapp.viewModel.MainViewModel


class mainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    lateinit var viewModel: MainViewModel;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = MainViewModel(activity!!.application)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding?.let {
            it.vm = viewModel
        }
        return binding.root
//        return inflater.inflate(R.layout.fragment_main, container, false)
    }


}
