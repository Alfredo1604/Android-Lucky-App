package com.example.urluckyapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.example.urluckyapp.domain.model.HoroscopeContent
import com.example.urluckyapp.domain.model.HoroscopeContent.*
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor() : ViewModel() {
    private var _horoscope = MutableStateFlow<List<HoroscopeContent>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeContent>> = _horoscope

    init {
        _horoscope.value = listOf(
            Aquarius, Aries, Cancer
        )
    }

}