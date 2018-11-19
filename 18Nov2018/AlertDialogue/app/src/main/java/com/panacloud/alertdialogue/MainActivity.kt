package com.panacloud.alertdialogue

import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button1)

        button.setOnClickListener {
            showPopUP()
        }
    }

    private fun showPopUP() {
        var dialogue = AlertDialog.Builder(this@MainActivity)
        val create = dialogue.create()
        //prevent dismiss
        dialogue.setCancelable(false)

        dialogue.setTitle("MyPOpUP")
        dialogue.setMessage("I am AlertDialogue!")
        dialogue.setPositiveButton("Positive", object : DialogInterface.OnClickListener {
            override fun onClick(p0: DialogInterface?, p1: Int) {
//                create.dismiss()
            }
        })
        dialogue.setNegativeButton("Negative",
            object : DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    create.dismiss()
                }
            })

        dialogue.show()

    }
}
