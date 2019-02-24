package com.axiom.chatapp.viewModel

import android.app.Application
import android.widget.Toast
import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel

class MainViewModel(private var ctx: Application) : AndroidViewModel(ctx) {
    var count = 0
    val visible = ObservableBoolean(false)
    val countObs = ObservableField<String>("empty")

    init {
        Toast.makeText(ctx, "Created", Toast.LENGTH_LONG).show()
    }

    fun fillText() = "Kotlin"
    public fun OnButtonClicked() {
        count++
        countObs.set(count.toString())
        visible.set(!visible.get())
    }

}