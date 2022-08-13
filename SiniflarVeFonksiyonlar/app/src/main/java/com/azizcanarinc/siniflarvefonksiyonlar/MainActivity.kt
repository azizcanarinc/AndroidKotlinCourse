package com.azizcanarinc.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
        button.setOnClickListener{
            val toplamaSonucu = toplama(10,50)
            textView.text="Sonuç : ${toplamaSonucu}"

        }
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
    /*
    fun degistir(view: View){
        val toplamaSonucu = toplama(10,50)
        textView.text="Sonuç : ${toplamaSonucu}"
    }*/
    fun sinifCalismasi(){
/*
        var isim ="superman"
        var meslek ="gazateci"
        var yas = 50

        var spiderManIsim="spiderman"
        var spidermeslek="gazateci"
        var spiderManyas = 20

        var superman = SuperKahraman()
        superman.isim="superman"
        superman.meslek="gazateci"
        superman.yas= 50

        var batman = SuperKahraman()
        batman.isim="superman"
        batman.meslek= ""
        batman.yas= 80

        textView.text = "Yaş : ${superman.yas}"
*/
        var superman = SuperKahraman("superman",50,"gazateci")
        textView.text = "Yaş : ${superman.yas}"
    }
    //
}