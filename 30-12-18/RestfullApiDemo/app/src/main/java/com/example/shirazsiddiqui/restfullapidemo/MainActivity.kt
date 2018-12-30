package com.example.shirazsiddiqui.restfullapidemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.shirazsiddiqui.restfullapidemo.models.NewsArticles
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getNewsBtn.setOnClickListener {
            Toast.makeText(this@MainActivity, "onBtn Click", Toast.LENGTH_SHORT).show()
            requestApi()
            Toast.makeText(this@MainActivity, "on funtion call", Toast.LENGTH_SHORT).show()


        }
    }

    private fun requestApi() {
        // call api
//        RestApi.retrofit.   it can be null
        RestApi.getClient()?.create(RestServices::class.java)?.getNewsArticlebyCountry()
            ?.enqueue(object : Callback<NewsArticles> {
                override fun onFailure(call: Call<NewsArticles>, t: Throwable) {

                    Toast.makeText(this@MainActivity, "OnFailure", Toast.LENGTH_SHORT).show()
                }

                override fun onResponse(call: Call<NewsArticles>, response: Response<NewsArticles>) {
                    Log.e("MainACtivity", "obj "+response.body().toString())
//                    response.body().articles
                    Toast.makeText(this@MainActivity, "OnSuccess", Toast.LENGTH_SHORT).show()

                }

            })
    }
}
