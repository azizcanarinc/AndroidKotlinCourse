package com.arincazizcan.oopkotlin

class Kullanici {
    var isim: String? = null
    var yas : Int? = null

    constructor(isim:String,yas:Int){
        this.isim=isim
        this.yas=yas
        println("constructor çağırıldı")

    }
    init{
        println("init çağırıldı")
    }
}