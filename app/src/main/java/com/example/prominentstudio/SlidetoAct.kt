package com.example.prominentstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prominentstudio.R
import com.ncorti.slidetoact.SlideToActView

class SlidetoAct : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slideto)

        val slide = findViewById<SlideToActView>(R.id.slide)

        slide.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {

                val _intent = Intent(this@SlidetoAct, Success::class.java)
                startActivity(_intent)
            }
        }
    }
}