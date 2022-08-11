package com.azizcanarinc.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var j = -10
        if(j==0){
            ilkFonksiyon()
        }
        else{
            ikinciFonksiyon()
        }
        cikarma(10,20)
    }
    fun ilkFonksiyon(){
        println("ilk fonksiyon çalışıyor")
    }

     fun ikinciFonksiyon() {
         println("ikinci fonksiyon çalışıyor")

     }

    //girdi alma
    fun cikarma(x:Int,y:Int){

    }
}