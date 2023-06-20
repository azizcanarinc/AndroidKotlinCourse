package com.arincazizcan.oopkotlin

class Kopek : Hayvan(){
    fun kopekFonksiyonu(){
        super.sesCikar()
        println("a")
        this.sesCikar()
    }
    override fun sesCikar(){
        println("Köpek Sınıfı")
    }


}