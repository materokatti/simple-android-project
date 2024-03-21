package com.example.androidstudy

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView = findViewById<ImageView>(R.id.logo_dog)
    }

//    fun onButtonClick(view: View) {
//        val text1 = findViewById<TextView>(R.id.text1)
//        when (view.id) {
//            R.id.button1 -> text1.text = "hello"
//            R.id.button2 -> text1.text = "world"
//        }
//    }

    fun onButtonClick(view: View) {
        // ImageView의 가시성을 토글
        if (view.id == R.id.button1) {
            // ImageView의 가시성을 토글합니다.
            imageView.visibility = if (imageView.visibility == View.VISIBLE) View.GONE else View.VISIBLE
        }
    }
}