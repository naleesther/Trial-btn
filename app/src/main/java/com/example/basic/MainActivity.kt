package com.example.basic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnOPEN : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOPEN = findViewById(R.id.btnOPEN)
        btnOPEN.setOnClickListener {
            val intent = Intent (this, names ::class.java )
            startActivity(intent)
        }

    }
}