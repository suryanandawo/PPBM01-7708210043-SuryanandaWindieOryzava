package com.example.prominentstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class Photography : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_photography)

        val btnFotolanjut = findViewById<Button>(R.id.fotolanjut)
        btnFotolanjut.setOnClickListener {
            val intent = Intent(this, Payment::class.java)
            startActivity(intent)
        }
        val btnKembali2 = findViewById<TextView>(R.id.back)
        btnKembali2.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}