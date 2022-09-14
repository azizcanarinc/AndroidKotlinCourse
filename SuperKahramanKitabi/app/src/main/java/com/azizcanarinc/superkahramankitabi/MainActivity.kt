package com.azizcanarinc.superkahramankitabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("baydırman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Flash")
        superKahramanIsimleri.add("İronman")

    }
}