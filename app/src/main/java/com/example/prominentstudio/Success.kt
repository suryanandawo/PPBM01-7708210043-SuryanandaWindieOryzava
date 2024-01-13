package com.example.prominentstudio

import android.content.Intent
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)

        val btnLanjut = findViewById<TextView>(R.id.lanjut)
        btnLanjut.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }

        // Menambahkan RatingBar
        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        ratingBar.setOnRatingBarChangeListener { _, rating, _ ->
            // Handle when the rating changes
            // Contoh: Toast.makeText(this, "Rating: $rating", Toast.LENGTH_SHORT).show()
        }
    }
}
