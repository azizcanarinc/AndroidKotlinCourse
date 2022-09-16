package com.azizcanarinc.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Baydırman")
        superKahramanIsimleri.add("Spiderman")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Flash")
        superKahramanIsimleri.add("İronman")

        val BaydirmanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.indir)
        val SpidermanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.aaa)
        val AquamanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.images)
        val FlashBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.flash)
        val İronmanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.iron)


        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(BaydirmanBitmap)
        superKahramanGorselleri.add(SpidermanBitmap)
        superKahramanGorselleri.add(AquamanBitmap)
        superKahramanGorselleri.add(FlashBitmap)
        superKahramanGorselleri.add(İronmanBitmap)



    }
}