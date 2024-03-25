package com.example.urluckyapp.domain.model

import com.example.urluckyapp.R

sealed class HoroscopeContent(val img:Int, val name:Int){

    object Aquarius:HoroscopeContent(R.drawable.acuario, R.string.aquarius)
    object Aries:HoroscopeContent(R.drawable.aries, R.string.aries)
    object Cancer:HoroscopeContent(R.drawable.cancer, R.string.cancer)
    object Capricorn:HoroscopeContent(R.drawable.capricornio, R.string.capricorn)
    object Gemini:HoroscopeContent(R.drawable.geminis, R.string.gemini)
    object Leo:HoroscopeContent(R.drawable.leo, R.string.leo)
    object Libra:HoroscopeContent(R.drawable.libra, R.string.libra)
    object Pisces:HoroscopeContent(R.drawable.piscis, R.string.pisces)
    object Sagittarius:HoroscopeContent(R.drawable.sagitario, R.string.sagittarius)
    object Scorpio:HoroscopeContent(R.drawable.scorpio, R.string.scorpio)
    object Taurus:HoroscopeContent(R.drawable.tauro, R.string.taurus)
    object Virgo:HoroscopeContent(R.drawable.virgo, R.string.virgo)

}
