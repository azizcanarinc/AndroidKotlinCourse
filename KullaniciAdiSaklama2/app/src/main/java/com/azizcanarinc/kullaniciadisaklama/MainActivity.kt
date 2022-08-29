package com.azizcanarinc.kullaniciadisaklama

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sharedPreferences = this.getSharedPreferences("com.azizcanarinc.kullaniciadisaklama",
            Context.MODE_PRIVATE)
    }
}