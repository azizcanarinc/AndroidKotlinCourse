package com.azizcanarinc.farkliaktiniteler


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.text.toSpanned
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun AktiviteDegistir(view: View){
        var kullaniciverisi=editText.text.toString()
        val intent =Intent(applicationContext,IkinciAktivitem::class.java)
        intent.putExtra("yollananVari",kullaniciverisi)
        startActivity(intent)
    }
}