package com.azizcanarinc.sqliteogrenmeprojesi

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //try catch

        try {

            val veritabani = this.openOrCreateDatabase("Urunlar", Context.MODE_PRIVATE,null)
            //veritabani.execSQL("CREATE TABLE IF NOT EXISTS urunler (id INTEGER PRIMARY KEY, isim VARCHAR, fiyat INT)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('Ayakkabi' ,5000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('ekrankartı' ,4000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('islemci ' ,10000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('kasa' ,3000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('monitor' ,12000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('sessistemi' ,2000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('anakart' ,11000)")
            //veritabani.execSQL("INSERT INTO urunler (isim,fiyat) VALUES ('ankrt' ,11000)")

            //veritabani.execSQL("DELETE FROM urunler WHERE id = 3")
            //veritabani.execSQL("UPDATE urunler SET fiyat = 250 where isim = 'ankrt'")
            veritabani.execSQL("UPDATE urunler SET isim = 'monitor' where isim = 'moniror'")

            //val cursor = veritabani.rawQuery("SELECT * FROM urunler WHERE isim = 'ekrankartı'",null)
            //val cursor = veritabani.rawQuery("SELECT * FROM urunler WHERE isim LIKE '%A%'",null)

            val cursor = veritabani.rawQuery("SELECT * FROM urunler",null)



            val idColumnIndex = cursor.getColumnIndex("id")
            val isimColumnIndex = cursor.getColumnIndex("isim")
            val fiyatColumnIndex = cursor.getColumnIndex("fiyat")

            while(cursor.moveToNext()){
                println("ID : ${cursor.getInt(idColumnIndex)}")
                println("Isim : ${cursor.getString(isimColumnIndex)}")
                println("Fiyat : ${cursor.getInt(fiyatColumnIndex)}")

            }
            cursor.close()

        }catch (e : Exception){
            e.printStackTrace()

        }
    }
}