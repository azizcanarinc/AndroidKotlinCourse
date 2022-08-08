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

        //String - Metin

        println("-------String--------")

        val benimString = "Benim Yeni Metnim"

        println(benimString.length)

        val isim = "AzizCan"
        val soyisim = "Arinç"

        val tamisim = isim+" "+soyisim
        println(tamisim)

        val yeniBirString : String
        yeniBirString = "10"
        val baskaBirString = "20"

        println(yeniBirString+baskaBirString)

        //Boolean

        println("-------Boolean--------")

        var benimBoolean = true
        benimBoolean=false

        println(3<5)
        println(4!=4)
        println((3+3)!=6)

        //Veri Tipi Dönüştürme

        println("-------Dönüştürme--------")

        var benimInt =10
        var benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        var kullaniciGirdisi = "50"
        var kullaniciInt = kullaniciGirdisi.toInt()
        println(kullaniciInt / 2)


        //koleksiyonlar

        //Array -Dizi

        println("-------Dizi--------")

        val stringOrnegi = "Aziz"

        val benimDizim = arrayOf(stringOrnegi,"Can","Arinç","Ayaz")

        //index
        println(benimDizim[0])
        println(benimDizim.get(1))
        println(benimDizim[0]+benimDizim[1]+benimDizim[2])
        println(benimDizim[3])
        benimDizim[3] = "Nihal"
        println(benimDizim[3])
        benimDizim.set(3,"Hakan")
        println(benimDizim[3])

        val numaraDizisi = arrayOf(1.0,2.0,3.5,5)
        println(numaraDizisi[3])
        println(numaraDizisi[2])


        val karisikDizi = arrayOf(" Aziz",3,7.5,true)
        println(karisikDizi.get(3))

        //ArrayList - Listeler

        println("-------ArrayList--------")

        val isimListesi= arrayListOf <String> ("Aziz","Alper","Ayaz","Nihal")



        println(isimListesi[3])
        println(isimListesi.get(2))
        isimListesi.add("Hakan")
        isimListesi.add("Musa")

        val karisikArrayList= arrayListOf <Any> ()
        karisikArrayList.add(7)
        karisikArrayList.add("Ayaz")
        karisikArrayList.add(false)




        val intArrayList= ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))


        //Set

        println("-------Set--------")

        val ornekDizi = arrayOf(7,8,9,9,9,10)
        println("index 2 : ${ornekDizi[2]}")
        println("index 3 : ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10,7)
        println(benimSet.size)

        benimSet.forEach {
            println(it)
        }



        val digerSet = HashSet<String>()
        digerSet.add("Aziz")
        digerSet.add("Aziz")
        digerSet.add("Can")
        digerSet.add("Aziz")
        digerSet.add("Arinç")

        digerSet.forEach{
        println(it)
        }


        //Map

        println("-------Map--------")

        //Anahtar Kelime - Değer (Key - Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)

        println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}")

        val yemekKalorisiMap = hashMapOf<String,Int>()
        yemekKalorisiMap.put("Elma",100)
        yemekKalorisiMap.put("Et",300)
        yemekKalorisiMap.put("Tavuk",200)

        println(yemekKalorisiMap.get("Et"))

        val benimMapim = hashMapOf<String,String>()
        benimMapim.put("ömer","değer")

        //val instaHesap = hashMapOf<String,String>("instaİsim" to "@arincazizcan" , "uygulamaİsim" to "instagram")
        //print(instaHesap["uygulamaİsim"] )
        //print(" ")
        //println(instaHesap["instaİsim"] )

    }
}