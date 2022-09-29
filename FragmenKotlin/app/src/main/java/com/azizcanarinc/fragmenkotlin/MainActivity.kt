package com.azizcanarinc.fragmenkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






    }
    fun ilkFragment (view:View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val ilkFragment = BlankFragment()
        fragmentTransaction.add(R.id.frameLayout,firstF)

    }
    fun ikinciFragment(view:View){

    }



}