package com.example.urluckyapp.ui.horoscope.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.urluckyapp.R
import com.example.urluckyapp.domain.model.HoroscopeContent

class HoroscopeAdapter(private var horoscopeList:List<HoroscopeContent> = emptyList()) :
    RecyclerView.Adapter<HoroscopeViewHolder>() {

        fun updateList(list: List<HoroscopeContent>){
            horoscopeList = list
            notifyDataSetChanged()
        }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HoroscopeViewHolder {
        return HoroscopeViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_horoscope, parent, false)
        )
    }

    override fun getItemCount() = horoscopeList.size

    override fun onBindViewHolder(holder: HoroscopeViewHolder, position: Int) {
       holder.iterate(horoscopeList[position])
    }
}