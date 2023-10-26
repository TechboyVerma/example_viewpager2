package com.verma.netclan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<CardView>(R.id.button)


        button.setOnClickListener(){
            val intent = Intent(this@MainActivity,main2::class.java)
            startActivity(intent)
        }
    }
}