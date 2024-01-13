package com.example.prominentstudio

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Payment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        val btnKembali = findViewById<TextView>(R.id.kembalilah)
        btnKembali.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
        val btnBayar = findViewById<TextView>(R.id.bayar)
        btnBayar.setOnClickListener {
            val intent = Intent(this, PIN::class.java)
            startActivity(intent)
        }
    }
}