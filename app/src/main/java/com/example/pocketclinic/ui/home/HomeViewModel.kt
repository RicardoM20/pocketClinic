package com.example.pocketclinic.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aqui encontraras notificaciones de mensajes, citas pendientes y expedientes"
    }
    val text: LiveData<String> = _text
}