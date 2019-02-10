package com.axiom.uploadpicture

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.annotation.GlideExtension
import com.bumptech.glide.request.RequestOptions
import com.google.firebase.storage.FirebaseStorage
import kotlinx.android.synthetic.main.activity_main.*
import java.io.ByteArrayOutputStream

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            var intent = Intent(Intent.ACTION_PICK)
            intent.setType("*/*")
            startActivityForResult(intent, 911)
        }


    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == 911) {
            val uri = data?.data
            val inputStream = this@MainActivity.getContentResolver().openInputStream(uri)
            val bitmap = BitmapFactory.decodeStream(inputStream)
//            val byteArrayOutputStream = ByteArrayOutputStream()
//            bitmap.compress(Bitmap.CompressFormat.PNG, 50, byteArrayOutputStream)
//            imgView.setImageBitmap(bitmap)

            uploadPictoDB(uri)
        }
    }

    private fun uploadPictoDB(uri: Uri?) {
        val reference = FirebaseStorage.getInstance().reference

        val storageReference = reference.child("Images/").child("${System.currentTimeMillis()}.jpg")
        storageReference.putFile(uri!!).addOnCompleteListener {
            val downloadUrl = it.result?.downloadUrl
            println("URL: $downloadUrl")


            Glide.with(this@MainActivity).applyDefaultRequestOptions(RequestOptions().apply {
                placeholder(CircularProgressDrawable(this@MainActivity).apply {
                    strokeWidth = 2f
                    centerRadius = 50f
                    start()
                })
            }).load(downloadUrl).into(imgView)
        }.addOnFailureListener {

        }

    }
}
