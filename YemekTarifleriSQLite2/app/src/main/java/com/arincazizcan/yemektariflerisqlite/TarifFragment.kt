package com.arincazizcan.yemektariflerisqlite

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.fragment_tarif.*
import java.util.jar.Manifest


class TarifFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tarif, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        button.setOnClickListener{
            kaydet(it)
        }
        imageView.setOnClickListener {
            gorselsec(it)
        }
    }

    fun kaydet(view: View){
        //SQLite'a Kaydetme
    }
    fun gorselsec(view: View){
       activity?.let {
           if (ContextCompat.checkSelfPermission(it.applicationContext,Manifest.))
       }
        
        
        
    }


}