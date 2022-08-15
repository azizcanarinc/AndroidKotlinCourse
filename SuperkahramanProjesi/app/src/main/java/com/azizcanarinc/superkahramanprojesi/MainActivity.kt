package com.azizcanarinc.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun superKahramanYap(view: View){

        val isim= isimText.text.toString()
        val yas= yasText.text.toString()
        val meslek= meslekText.text.toString()
        sonucText.text="isim: ${isim} yaş: ${yas} meslek: ${meslek}"


    }

}