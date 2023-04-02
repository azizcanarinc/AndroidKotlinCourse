package com.arincazizcan.yemektariflerisqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater = menuInflater
        menuInflater.inflate(R.menu.yemek_ekle,menu)

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == R.id.yemek_ekleme_item){
            val action = ListeFragmentDirections.actionListeFragmentToTarifFragment()
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action )
        }


        return super.onOptionsItemSelected(item)
    }


    //A/libc: Fatal signal 11 (SIGSEGV), code 1 (SEGV_MAPERR), fault addr 0x0 in tid 8437 (FinalizerDaemon), pid 8411 (tariflerisqlite)
    //E/System: Uncaught exception thrown by finalize
}

