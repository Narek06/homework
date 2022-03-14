package com.example.project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val tw = findViewById<TextView>(R.id.textView)
        val btn1 = findViewById<Button>(R.id.button2)
        var num = 0
        btn.setOnClickListener {
            num++
            tw.setText(num.toString())
        }
        btn1.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("num",tw.text.toString())
            startActivity(intent)
        }
    }
}