package com.axiom.democustomadapter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private var myListView: ListView? = null
    private var dataList :ArrayList<ModelClass> =
            ArrayList()
    private var listAdapter:CustmAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myListView = findViewById<ListView>(R.id.listView)
        listAdapter = CustmAdapter(this@MainActivity,dataList)

        var myObj = ModelClass(R.drawable.car_placeholder,"abc","123")
        var myObj1 = ModelClass(R.drawable.car_placeholder,"abc1","123")
        var myObj2 = ModelClass(R.drawable.car_placeholder,"abc2","123")
        var myObj3 = ModelClass(R.drawable.car_placeholder,"abc3","123")
        dataList.add(myObj)
        dataList.add(myObj1)
        dataList.add(myObj2)
        dataList.add(myObj3)
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram1","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram2","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram2","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram2","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram2","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram2","1999"))
        dataList.add(ModelClass(R.drawable.car_placeholder,"Khurram2","1999"))

        myListView?.adapter = listAdapter


//        var kchBRakhLain: ModelClass =
//                ModelClass(R.drawable.car_placeholder,
//                        "CAr","1999")
//        println(kchBRakhLain)

    }
}
