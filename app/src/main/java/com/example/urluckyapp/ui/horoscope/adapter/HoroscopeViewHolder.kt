package com.example.urluckyapp.ui.horoscope.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.urluckyapp.databinding.ItemHoroscopeBinding
import com.example.urluckyapp.domain.model.HoroscopeContent

class HoroscopeViewHolder(view: View):RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun iterate(horoscopeContent: HoroscopeContent){
        val context = binding.horoscopeTextView.context

        binding.horoscopeImageView.setImageResource(horoscopeContent.img)
        binding.horoscopeTextView.text = context.getString(horoscopeContent.name)

    }

}