package com.example.project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val downloadIntent = Intent(this, DOWNLOAD_SERVICE::class.java)
        val btn2 = findViewById<Button>(R.id.button3)
        val btn3 = findViewById<Button>(R.id.button4)
        val tw1 = findViewById<TextView>(R.id.textView2)
        tw1.text = intent.getStringExtra("num")

        btn2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        var num = tw1.text.toString().toInt()
        btn3.setOnClickListener {
            num--
            tw1.setText(num.toString())
        }
    }
}