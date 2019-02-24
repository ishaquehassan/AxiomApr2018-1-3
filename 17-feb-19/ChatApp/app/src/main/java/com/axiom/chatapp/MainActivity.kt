package com.axiom.chatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.axiom.chatapp.databinding.ActivityMainBinding
import com.axiom.chatapp.viewModel.MainViewModel

//https://developer.android.com/kotlin/ktx

class MainActivity : AppCompatActivity() {
    lateinit var viewModel: MainViewModel
    lateinit var activityMainBinding: ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)

        activityMainBinding?.let {
            viewModel = MainViewModel(application)
            it.vm = viewModel
        }
    }


}
