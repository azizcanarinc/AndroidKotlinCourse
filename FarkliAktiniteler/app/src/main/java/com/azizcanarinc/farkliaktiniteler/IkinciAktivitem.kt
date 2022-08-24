package com.azizcanarinc.farkliaktiniteler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ikinci_aktivitem.*

class IkinciAktivitem : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivitem)
        val intent = intent
        val alinanveri=intent.getStringExtra("yollananVeri")
        textView2.text=alinanveri
    }
}