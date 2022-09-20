package com.azizcanarinc.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.collections.ArrayList

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
/*
        val BaydirmanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.indir)
        val SpidermanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.omgec)
        val AquamanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.images)
        val FlashBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.flash)
        val İronmanBitmap =BitmapFactory.decodeResource(applicationContext.resources,R.drawable.iron)


        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(BaydirmanBitmap)
        superKahramanGorselleri.add(SpidermanBitmap)
        superKahramanGorselleri.add(AquamanBitmap)
        superKahramanGorselleri.add(FlashBitmap)
        superKahramanGorselleri.add(İronmanBitmap)

 */

        val baydirmanDrawableId = R.drawable.indir
        val spidermanDrawableId = R.drawable.omgec
        val aquamanDrawableId = R.drawable.images
        val flashDrawableId = R.drawable.flash
        val ironmanDrawableId = R.drawable.iron

        var superKahramanDrawableListesi = ArrayList<Int>()
        superKahramanDrawableListesi.add(baydirmanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(flashDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)







        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager =layoutManager


        val adapter = RecyclerAdapter(superKahramanIsimleri,superKahramanDrawableListesi)
        recyclerView.adapter = adapter



    }
}