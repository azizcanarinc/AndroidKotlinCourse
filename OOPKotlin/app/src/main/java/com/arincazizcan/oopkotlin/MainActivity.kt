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

        val eymen = OzelSanatci("Eymen",0,"ressam")
        eymen.sarkiSoyle()

        println("-------Polymorphism-------")

        //Statik Polymorphism

        val islem = Islemler()
        println(islem.carpma())
        println(islem.carpma(1,3))
        println(islem.carpma(2,3,4))

        //Dinamik Polymorphism
        val kedi = Hayvan()
        kedi.sesCikar()
        val pasa =Kopek()
        pasa.sesCikar()
        pasa.kopekFonksiyonu()

        println("-------Abstraction & Interface-------")

        kullanici.insanFonksiyonu()
        var gitar =Gitar()
        gitar.marka="gitar markası"
        gitar.elektro=true
        gitar.bilgi()
        var a = gitar.oda
        println(a)

        println("-------Lambda Gösterimleri-------")
yazdigimiYazdir("test")
        val yazdigimiYazdirLambda= { verilenString : String -> println(verilenString)}
        yazdigimiYazdirLambda("test lambda")
         val yazıLambda={a:String,b:String -> println(a+b)}
        yazıLambda("azi","z")
        val carpmaLambda ={a:Int,b:Int -> a*b}
        println(carpmaLambda(3,9999))

    }
fun yazdigimiYazdir(String:String){
    println(String)
}
}