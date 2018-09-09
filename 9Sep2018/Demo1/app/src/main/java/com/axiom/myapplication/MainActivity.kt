package com.axiom.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


class MainActivity : AppCompatActivity() {

    private lateinit var checkbox1: CheckBox
    private lateinit var checkbox2: CheckBox
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkbox1 = findViewById<CheckBox>(R.id.checkbox1)
        checkbox2 = findViewById<CheckBox>(R.id.checkbox2)
        listView = findViewById<ListView>(R.id.listView)

//        val myArray = arrayOf<String>("Khurram", "ALi", "Basit", "Sheraz", "Shahzeb")
        val myArray = arrayOf<ModelClass>(
                ModelClass("Khurram", 22),
                ModelClass("Ali", 20),
                ModelClass("Shahzeb", 18),
                ModelClass("Sheraz", 19)
        )
//        var arrayAdapter: ArrayAdapter<String> =
//                ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, myArray)
        var arrayAdapter: ArrayAdapter<ModelClass> =
                ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_2, android.R.id.text1, myArray)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener(object : AdapterView.OnItemClickListener {
            override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                var positionData = myArray[position]
                Toast.makeText(this@MainActivity
                        , "POsitionCLicked $positionData \n index:$position "
                        , Toast.LENGTH_LONG).show()

            }
        })

//        checkbox1.isChecked = false
//        checkbox2.isChecked = false

        checkbox1.setOnCheckedChangeListener(object : CompoundButton.OnCheckedChangeListener {
            override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
                if (isChecked) {
                    checkbox1.text = "true"
                } else {
                    checkbox1.text = "false"
                }
            }
        })


    }

    data class ModelClass(var name: String = "", var age: Int = 0)
}
