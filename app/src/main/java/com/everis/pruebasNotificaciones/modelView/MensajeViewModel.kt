package com.everis.pruebasNotificaciones.modelView

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.everis.pruebasNotificaciones.dao.MensajeEntity
import com.everis.pruebasNotificaciones.repository.Repository


class MensajeViewModel(application: Application) : AndroidViewModel(application) {
    private val repository = Repository(application)
    val contacts = repository.getMensajes()

    fun saveMensaje(mensaje: MensajeEntity) {
        repository.insert(mensaje)
    }
}