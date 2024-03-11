package com.example.androidstudy

import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        val text1 = findViewById<TextView>(R.id.text1)
        when (view.id) {
            R.id.button1 -> text1.text = "hello"
            R.id.button2 -> text1.text = "world"
        }
    }
}