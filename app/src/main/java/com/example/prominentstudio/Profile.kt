package com.example.prominentstudio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Mengatur tata letak

        val spinner1 = findViewById<Spinner>(R.id.spinner1) // Menemukan Spinner dalam tata letak
        val options = arrayOf("Student", "Designer", "Videographer", "Logo Designer")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, options)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner1.adapter = adapter

        spinner1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parentView: AdapterView<*>?,
                selectedItemView: View?,
                position: Int,
                id: Long
            ) {
                // Handler pemilihan item
                val selectedOption = options[position]
                Toast.makeText(
                    this@Profile,
                    "Anda memilih: $selectedOption",
                    Toast.LENGTH_SHORT
                ).show()
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // Tidak ada yang dipilih
            }
        }

        val spinner2 = findViewById<Spinner>(R.id.spinner2) // Menemukan Spinner lain dalam tata letak
        val options2 = arrayOf("Foto Produk", "Dokumentasi", "Konsultasi", "Video Profile", "Event Aftermovie", "Logo Design", "Mockup")

        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, options2)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner2.adapter = adapter2

        spinner2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parentView: AdapterView<*>?, selectedItemView: View?, position: Int, id: Long) {
                val selectedOption = options2[position]
                Toast.makeText(this@Profile, "Anda memilih: $selectedOption", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parentView: AdapterView<*>?) {
                // Tidak ada yang dipilih
            }
        }

        val btnDone = findViewById<TextView>(R.id.finish)
        btnDone.setOnClickListener {
            val intent = Intent(this, MainMenu::class.java)
            startActivity(intent)
        }
    }
}