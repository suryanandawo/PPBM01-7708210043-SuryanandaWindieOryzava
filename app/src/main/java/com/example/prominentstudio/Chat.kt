package com.example.prominentstudio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.prominentstudio.databinding.ActivityChatBinding
import com.example.prominentstudio.R
import com.example.prominentstudio.user


class Chat : AppCompatActivity() {

    private lateinit var binding : ActivityChatBinding
    private lateinit var userArrayList : ArrayList<user>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val img_pindah = findViewById<ImageView>(R.id.backmsg)

        img_pindah.setOnClickListener {
            val _intentPindah =
                Intent(this,MainMenu::class.java)

            startActivity(_intentPindah)
        }

        val imageId = intArrayOf(

            R.drawable.regha, R.drawable.ragil,R.drawable.bejod,R.drawable.emhapis,R.drawable.wan,
            R.drawable.aini,R.drawable.awul,R.drawable.byong,R.drawable.hkk,
        )
        val Lastmessage = arrayOf(
            "foto fotonya bagus banget!",
            "Professional Work!",
            "ka, aku pesen 2 ya besok",
            "puh sepuhh tutor dong puh",
            "bisa jasa video produk ga bang?",
            "jasa fotografi dan videografi ter-worth!",
            "yang nanya ini ngejar apa ga, ini ngejar ya",
            "aa kasian aa",
            "cape jadi fens emyu bang"
        )

        val name = arrayOf(
            "Regha Sugilar",
            "Ragil Wildan",
            "Alfa Bejod",
            "Emhapis",
            "Wan Salsa",
            "Nur Aini",
            "Auleyaa",
            "Abdhie Bayong",
            "Hakiki fens emyu",
        )

        val email = arrayOf(
            "reghasugilar@gmail.com","rwildan@gmail.com","bezodd@gmail.com","hapiscol@gmail.com","bubblewan@gmail.com",
            "nuraini@gmail.com","auleyaa@gmail.com","mbayongie@gmail.com","pensemyu@gmail.com"
        )

        val lastmsgTime = arrayOf(
            "9 Sep","11 Des","4 Maret","31 Feb","18 Jan",
            "15 Jun","27 Jul","8 Okt","19 Feb","11 Nov","90 Mar"
        )

        val country = arrayOf(
            "Bandung","Tasik","Jaseng","Cijambe","Edelweis",
            "Riau","Banjaran","Kelapa Sawit","Kalimantan"
        )

        val comment = arrayOf(
            "foto fotonya bagus banget!", "Professional Work!",
            "ka, aku pesen 2 ya besok",
            "puh sepuhh tutor dong puh",
            "bisa jasa video produk ga bang?",
            "jasa fotografi dan videografi ter-worth!",
            "yang nanya ini ngejar apa ga, ini ngejar ya",
            "aa kasian aa",
            "cape jadi fens emyu bang"
        )

        userArrayList = ArrayList()

        for (i in name.indices){

            val user = user(name[i], Lastmessage[i], lastmsgTime[i], email[i], country[i], imageId[i], comment[i])
            userArrayList.add(user)
        }
        binding.listanggota.isClickable = true
        binding.listanggota.adapter = MyAdapter(this,userArrayList)
        binding.listanggota.setOnItemClickListener { parent, view, position, id ->

            val name = name[position]
            val phone = email[position]
            val country = country[position]
            val imageid = imageId[position]
            val comment = comment[position]


            val i = Intent(this,UserActivity::class.java)
            i.putExtra("name",name)
            i.putExtra("country",country)
            i.putExtra("email",phone)
            i.putExtra("imageId",imageid)
            i.putExtra("comment",comment)

            startActivity(i)
        }
    }
}