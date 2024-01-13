package com.example.prominentstudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.prominentstudio.databinding.ActivityUserBinding
import com.google.android.material.snackbar.Snackbar

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        button = findViewById(R.id.buttong)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("email")
        val country = intent.getStringExtra("country")
        val imageid = intent.getIntExtra("imageId", R.drawable.naandround)
        val comment = intent.getStringExtra("comment")

        button.setOnClickListener { view ->
            showCustomSnackbar(view, "Terima Kasih sudah menghubungi")
        }

        binding.fullName.text = name
        binding.countryname.text = phone
        binding.phoneNo.text = country
        binding.prof.setImageResource(imageid)
        binding.comment.text = comment

    }

    private fun showCustomSnackbar(view: View, message: String) {
        val snackbar = Snackbar.make(view, "", Snackbar.LENGTH_SHORT)
        val snackbarLayout = snackbar.view as Snackbar.SnackbarLayout

        // Inflate custom layout
        val customSnackbarView = layoutInflater.inflate(R.layout.custom_snackbar_layout, null)

        // Customize the custom layout
        val iconImageView: ImageView = customSnackbarView.findViewById(R.id.snackbar_icon)
        val textTextView: TextView = customSnackbarView.findViewById(R.id.snackbar_text)

        // Customize icon or text as needed
        iconImageView.setImageResource(R.drawable.vector1)
        textTextView.text = message

        // Add custom layout to Snackbar layout
        snackbarLayout.addView(customSnackbarView, 0)

        // Show the Snackbar
        snackbar.show()
    }
}