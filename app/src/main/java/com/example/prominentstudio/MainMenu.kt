package com.example.prominentstudio

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.prominentstudio.R.style.dialoganimation

class MainMenu : AppCompatActivity() {

    private lateinit var dash: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
        dash = findViewById(R.id.dash)

        dash.setOnClickListener {
            showDialog()
        }

        val btnFoto = findViewById<CardView>(R.id.cardfoto)
        btnFoto.setOnClickListener {
            val intent = Intent(this, Photography::class.java)
            startActivity(intent)
        }
        val btnProfile = findViewById<ImageView>(R.id.profile)
        btnProfile.setOnClickListener {
            val intent = Intent(this, Profile::class.java)
            startActivity(intent)
        }
        val btnVideo = findViewById<CardView>(R.id.cardvideo)
        btnVideo.setOnClickListener {
            val intent = Intent(this, Videography::class.java)
            startActivity(intent)
        }
        val btnLogo = findViewById<CardView>(R.id.cardlogo)
        btnLogo.setOnClickListener {
            val intent = Intent(this, Logo::class.java)
            startActivity(intent)
        }
        val btnBack = findViewById<TextView>(R.id.kembali)
        btnBack.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
    }

    private fun showDialog() {
        val dialog = Dialog(this)
        val view = layoutInflater.inflate(R.layout.bottomsheet, null)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setContentView(view)

        val pindahgalery = dialog.findViewById<CardView>(R.id.tombolgalery)
        val pindahchat = dialog.findViewById<CardView>(R.id.chat)
        val pindahnews = dialog.findViewById<CardView>(R.id.testi)

        pindahgalery.setOnClickListener {
            val _intentpindah =
                Intent(this, Gallery::class.java)
            startActivity(_intentpindah)
        }
        pindahchat.setOnClickListener {
            val _intentpindah =
                Intent(this, Chat::class.java)
            startActivity(_intentpindah)
        }
        pindahnews.setOnClickListener {
            val _intentpindah =
                Intent(this, Profile::class.java)
            startActivity(_intentpindah)
        }
        dialog.show()
        dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.window?.attributes?.windowAnimations = dialoganimation
        dialog.window?.setGravity(Gravity.BOTTOM)
    }
}