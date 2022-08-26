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
        println("sa")
        println("onCrate çağırıldı")
    }

    override fun onStart() {
        super.onStart()
        println("onStart çağırıldı")
    }

    override fun onResume() {
        super.onResume()
        println("onResume çağırıldı")
    }

    override fun onPause() {
        super.onPause()
        println("onPause çağırıldı")
    }

    override fun onStop() {
        super.onStop()
        println("onStop çağırıldı")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy çağırıldı")
    }

fun AktiviteDegistir (view:View){
val intent=Intent(applicationContext,IkinciAktivitem::class.java)
    startActivity(intent)
}
}