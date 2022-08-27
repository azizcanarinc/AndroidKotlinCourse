package com.azizcanarinc.farkliaktiniteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivitem.*

class IkinciAktivitem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivitem)
    }
    fun AktiviteDegistir (view: View){
        val intent= Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}