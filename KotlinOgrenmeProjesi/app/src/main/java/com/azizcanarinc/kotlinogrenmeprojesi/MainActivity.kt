package com.azizcanarinc.kotlinogrenmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable

class MainActivity() : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("merhaba kotlin")
        println(5*10)

        //değişkenler ve sabitler
        //  Integer

        println("-------Int--------")

        var a = 5
        var b = 10


        println(a * b)
        println(a * a)

        var yas = 50

        println(yas / 5 * 8)

        yas=60

        println(yas / 5 * 8)


        val x = 5
        val y = 20
        println(x+y)

        // camelCase   yasSonucu
        //  snake_case yas_sonucu

        val yasSonucu = yas * x
        println(yasSonucu)

        // tanımlama (Defining)

        val benimIntegerim : Int

        //başlatma değerini atama

        benimIntegerim = 5

        var yeniInteger : Int = 20

        println(benimIntegerim / 2)

        //Long

        println("-------Long--------")

        var benimLong : Long = 100
        benimLong = 900000000000
        println(benimLong)

        //Double & Long

        println("-------Double & Long--------")
        val pi = 3.14

        println(pi * 2)

        // float tanımlama

        val floatPi : Float = 3.14f
        println(floatPi * 2)


        val yeniDuble = 5.0
        println(yeniDuble / 2)






    }
}