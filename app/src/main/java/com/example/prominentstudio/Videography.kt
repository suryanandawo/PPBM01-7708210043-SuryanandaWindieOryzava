package com.example.prominentstudio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Videography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videography)

        val btnKembali = findViewById<TextView>(R.id.back)
        btnKembali.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
        val btnLanjut = findViewById<Button>(R.id.fotolanjut)
        btnLanjut.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }
    }
}