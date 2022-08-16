package com.azizcanarinc.superkahramanprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var numara = 0
    private var isim = ""
    private var yas : Int?= null
    private var meslek= ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numara=5
    }

    fun superKahramanYap(view: View){
        numara=10

         isim= isimText.text.toString()
         yas= yasText.text.toString().toIntOrNull()
         meslek= meslekText.text.toString()
        if (yas==null){
            sonucText.text= "Yaşı Doğru Girin"
        }else {
            var superKahraman = SuperKahraman(isim, yas!!, meslek)
            sonucText.text =
                "isim: ${superKahraman.isim} yaş: ${superKahraman.yas} meslek: ${superKahraman.meslek}"
        }


    }

}