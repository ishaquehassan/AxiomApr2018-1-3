package com.panacloud.commonintent

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.drm.DrmStore
import android.graphics.Bitmap
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var map_button: Button
    private lateinit var url_button: Button
    private lateinit var dial_button: Button
    private lateinit var camera_button: Button
    private val CAMERA_PERMISSION_CODE: Int = 55

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        map_button = findViewById<Button>(R.id.map_btn)
        url_button = findViewById<Button>(R.id.url_btn)
        dial_button = findViewById<Button>(R.id.dial_btn)
        camera_button = findViewById<Button>(R.id.camera_btn)

        map_button.setOnClickListener {
            openMap()
        }
        url_button.setOnClickListener {
            openUrl()
        }
        dial_button.setOnClickListener {
            dialNumber()
        }

        camera_button.setOnClickListener {
            openCamera()
        }
    }

    private fun openCamera() {
        if (ContextCompat.checkSelfPermission(
                this@MainActivity,
                Manifest.permission.CAMERA
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 43)
        }
        else {
            ActivityCompat.requestPermissions(
                this@MainActivity,
                arrayOf(Manifest.permission.CAMERA), CAMERA_PERMISSION_CODE
            )
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            CAMERA_PERMISSION_CODE -> {
                if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    openCamera()
                }
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            43 -> {
                if (resultCode == Activity.RESULT_OK) {
                    val data = data?.extras?.get("data")
                    img_view.setImageBitmap(data as Bitmap)
                }
            }
            else -> {

            }
        }


    }


    private fun dialNumber() {
        val uri = Uri.parse("tel:090078601")
        val dialIntent = Intent(Intent.ACTION_DIAL)
        startActivity(dialIntent)
    }

    private fun openUrl() {
        val url = Uri.parse("http://www.example.com")
        val i = Intent(Intent.ACTION_VIEW, url)
        startActivity(i)
    }

    private fun openMap() {
        var uri = Uri.parse("https://www.google.com/maps")
        var mapIntent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(mapIntent)
    }
}
