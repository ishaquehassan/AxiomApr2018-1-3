package com.panacloud.spinners

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var firstname : EditText
    lateinit var lastname : EditText
    lateinit var age : EditText
    lateinit var county : Spinner
    lateinit var Gender : Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstname = findViewById(R.id.firstname)
        lastname = findViewById(R.id.lastname)
        age = findViewById(R.id.age)
        county = findViewById(R.id.country_spinner)
        Gender = findViewById(R.id.gender_spinner)
        var gender = arrayOf("MALE","FEMALE","OTHER")

        var arrayadapter = ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item,gender)
        Gender.adapter = arrayadapter

        county.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                var coun = p0?.getItemAtPosition(position).toString()
                Toast.makeText(this@MainActivity,coun,Toast.LENGTH_LONG).show()
            }

        }
        Gender.onItemSelectedListener = object :AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                var gen = p0?.getItemAtPosition(p2).toString()
                Toast.makeText(this@MainActivity,gen,Toast.LENGTH_LONG).show()
            }

        }

    }
}
