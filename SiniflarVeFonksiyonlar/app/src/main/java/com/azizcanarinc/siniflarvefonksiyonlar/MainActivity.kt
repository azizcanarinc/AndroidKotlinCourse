package com.azizcanarinc.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

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
        cikarma(500,20)
        var x = toplama(10,20)
        textView.text="Sonuç : ${x}"
    }
    fun ilkFonksiyon(){
        println("ilk fonksiyon çalışıyor")
    }

     fun ikinciFonksiyon() {
         println("ikinci fonksiyon çalışıyor")

     }

    //girdi alma
    fun cikarma(x:Int,y:Int){
       textView.text="Sonuç : ${x-y}"
    }
    //çıktı vermek -> döndürme(return)
    fun toplama(a:Int,b:Int):Int{
        return a+b
    }
}