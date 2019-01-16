package com.axiom.demonetworkcalls

import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import java.io.BufferedInputStream
import java.io.InputStreamReader
import java.lang.Exception
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1.setOnClickListener {
            HttpTask().execute("https://jsonplaceholder.typicode.com/posts")
            Log.d("TAG 1 ", "Clicked")
        }
    }

    inner class HttpTask : AsyncTask<String, String, String>() {
        //       override fun onPreExecute() {
////           super.onPreExecute()
//       }
        override fun doInBackground(vararg params: String?): String? {
            Log.d("TAG 1 ", "Do in background")

            val path = params[0]
            val url = URL(path)
//    val openConnection = url.openConnection()
            val urlConnection = url.openConnection() as HttpURLConnection
           return try {
                val bufferedInputStream = BufferedInputStream(urlConnection.inputStream)
                val inputStreamReader = InputStreamReader(bufferedInputStream)
                val readLines = inputStreamReader.readLines()
                readLines.joinToString("\n")

          } catch (e: Exception) {
               return null

           } finally {
               urlConnection.disconnect()
            }
//            return ""
//            HttpURLConnection


//            return ""
        }

        override fun onPostExecute(result: String?) {
//           super.onPostExecute(result)
            if(result!=null){

                Log.d("TAG 1 ", result)

                val books = Gson().fromJson(result,Array<Books>::class.javaObjectType)
//                arraylist.addAll(books)



            }else{
                Log.d("TAG 1 ", "No Response")

            }
        }

    }

}
