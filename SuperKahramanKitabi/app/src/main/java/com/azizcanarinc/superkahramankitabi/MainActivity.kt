package com.azizcanarinc.superkahramankitabi

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_row.*
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



        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager =layoutManager


        val adapter = RecyclerAdapter(superKahramanIsimleri,superKahramanGorselleri)
        recyclerView.adapter = adapter



    }
}