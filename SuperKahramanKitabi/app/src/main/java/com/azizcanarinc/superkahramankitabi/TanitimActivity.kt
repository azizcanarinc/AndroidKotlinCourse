package com.azizcanarinc.superkahramankitabi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tanitim.*

class TanitimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tanitim)

        val intent= intent
        val secilenKahramanIsmi = intent.getStringExtra("superKahramanIsmi")
        textView.text = secilenKahramanIsmi

        val secilenKahraman = SingletonClass.secilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        imageView.setImageBitmap(secilenGorsel)
    }
}