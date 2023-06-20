package com.arincazizcan.oopkotlin

class Gitar : Enstruman,Dekorasyon {
    var marka : String? = null
    var elektro : Boolean? =null
    override var oda: String
        get() = ("yatak odası")
        set(value) {}
}