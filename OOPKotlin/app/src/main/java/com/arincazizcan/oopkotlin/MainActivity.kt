package com.arincazizcan.oopkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.PrimitiveIterator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-------sınıflar-------")

        val kullanici = Kullanici("aziz",14)
        val digerKullanıcı = Kullanici("ayaz",9)

        println("-------Encapsulation-------")

        val alper=Sanatci("Alper",30,"yazılımcı")
        println(alper.isim)
        //alper.isim=Alper2
        println(alper.isim)


        println("-------Inhereritance-------")





    }

}