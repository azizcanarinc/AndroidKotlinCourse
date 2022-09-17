package com.azizcanarinc.superkahramankitabi

import android.graphics.Bitmap
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList
import kotlin.collections.ArrayList

class RecyclerAdapter(val kahramanListesi : ArrayList<String>,val kahramanGorselleri : ArrayList<Bitmap>) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {
    class SuperKahramanVH(itemView:View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {

    }
    override fun getItemCount(): Int {
        return kahramanListesi.size

    }


    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

    }



}