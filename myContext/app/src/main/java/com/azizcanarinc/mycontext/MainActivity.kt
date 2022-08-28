package com.azizcanarinc.mycontext

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Hoş Geldiniz!",Toast.LENGTH_LONG).show()
    }


    fun mesajGoster (view: View){
        val uyarıMesaji = AlertDialog.Builder(this@MainActivity)
        uyarıMesaji.setTitle("Şifre Hatası")
        uyarıMesaji.setMessage("Şifreyi Girmediniz,Lütfen Tekrar Deneyiniz")
        uyarıMesaji.setPositiveButton("Evet",DialogInterface.OnClickListener { dialogInterface, i ->
            Toast.makeText(this,"Tekrar Giriniz",Toast.LENGTH_LONG).show()

        } )
        uyarıMesaji.setNegativeButton("Hayır"){dialogInterface, i ->
            Toast.makeText(this,"Hayırı Seçtiniz, tekrar deniyemessiniz",Toast.LENGTH_LONG).show()

        }
        uyarıMesaji.show()

    }


}