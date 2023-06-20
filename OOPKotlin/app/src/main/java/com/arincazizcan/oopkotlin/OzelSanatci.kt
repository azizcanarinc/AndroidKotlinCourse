package com.arincazizcan.oopkotlin

class OzelSanatci(isim: String, yas: Int, meslek: String) : Sanatci(isim, yas, meslek) {
    fun sarkiSoyle(){
        println("Şarkı söyleniyor")
    }
}