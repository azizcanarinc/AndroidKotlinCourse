package com.azizcanarinc.farkliaktiniteler


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun AktiviteDegistir(view: View){
        val intent =Intent(applicationContext,IkinciAktivitem::class.java)
        startActivity(intent)
    }
}