package com.azizcanarinc.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var sayi1:Int?=null
    var sayi2:Int?=null
    fun top (view: View){
        sayi1=editText.text.toString().toIntOrNull()
        sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null) {
        textView.text="Boşluklara Sayı Girin"
        }else{
         var sonuc =sayi1!!+ sayi2!!
            textView.text=("Sonuc: ${sonuc}")
        }
    }
    fun cik (view: View){
        sayi1=editText.text.toString().toIntOrNull()
        sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null ||sayi2==null) {
            textView.text="Boşluklara Sayı Girin"
        }else{
            var sonuc =sayi1!! - sayi2!!
            textView.text=("Sonuc: ${sonuc}")
        }
    }
    fun car (view: View){
        sayi1=editText.text.toString().toIntOrNull()
        sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null) {
            textView.text="Boşluklara Sayı Girin"
        }else{
            var sonuc =sayi1!! * sayi2!!
            textView.text=("Sonuc: ${sonuc}")
        }
    }
    fun bol (view: View){
        sayi1=editText.text.toString().toIntOrNull()
        sayi2=editText2.text.toString().toIntOrNull()

        if (sayi1==null || sayi2==null) {
            textView.text="Boşluklara Sayı Girin"
        }else{
            var sonuc =sayi1!! /sayi2!!
            textView.text=("Sonuc: ${sonuc}")
        }
    }
}