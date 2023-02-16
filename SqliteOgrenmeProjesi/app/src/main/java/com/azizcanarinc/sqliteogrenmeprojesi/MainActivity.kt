package com.azizcanarinc.sqliteogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //try catch

        try {

            val veritabani = this.openOrCreateDatabase()


        }catch (e : Exception){
            e.printStackTrace()

        }
    }
}