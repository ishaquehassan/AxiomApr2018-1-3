package com.axiom.labtask

import android.arch.persistence.room.Room
import android.os.AsyncTask
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_main.*
import java.io.BufferedInputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var database: MyDatabase
    lateinit var adapter: MyAdapter
    var postList: ArrayList<Post> = ArrayList<Post>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = Room.databaseBuilder(this@MainActivity, MyDatabase::class.java, "MyDB2")
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration().build()
//        database.getDao().insert(Post(0, 11, "Harris Post", "Xyz"))
        recycler_view.layoutManager = LinearLayoutManager(this@MainActivity)
        adapter = MyAdapter(this@MainActivity, postList)
        recycler_view.adapter = adapter
        postList.addAll(database.getDao().getAll())
        adapter.notifyDataSetChanged()
        HttpTask().execute("https://jsonplaceholder.typicode.com/posts")


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
            Log.d("TAG 1 ", "done")

            if (result != null) {

                Log.d("TAG 1 ", result)

                val books = Gson().fromJson(result, Array<Post>::class.javaObjectType)
                books.forEach {
                    try {
                        database.getDao().insert(it)

                    } catch (e: Exception) {

                    }
                }
//                arraylist.addAll(books)


            } else {
                Log.d("TAG 1 ", "No Response")

            }
        }

    }
}
