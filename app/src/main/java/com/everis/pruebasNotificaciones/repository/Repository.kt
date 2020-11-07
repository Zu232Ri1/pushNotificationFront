package com.everis.pruebasNotificaciones.repository

import android.app.Application
import android.content.Context
import android.os.AsyncTask
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.everis.pruebasNotificaciones.configRoom.DataBaseRoom
import com.everis.pruebasNotificaciones.dao.MensajeDao
import com.everis.pruebasNotificaciones.dao.MensajeEntity
import javax.inject.Inject


class Repository (application: Application){
    private val mensajeDao: MensajeDao? = DataBaseRoom.getInstance(application)?.mensajeDao()

    fun insert(mensajeEntity: MensajeEntity) {
        if (mensajeDao != null) InsertAsyncTask(mensajeDao).execute(mensajeEntity)
    }

    fun getMensajes(): LiveData<List<MensajeEntity>> {
        return mensajeDao?.getOrderedMensajes() ?: MutableLiveData<List<MensajeEntity>>()
    }

    private class InsertAsyncTask(private val mensajeDao: MensajeDao) :
        AsyncTask<MensajeEntity, Void, Void>() {
        override fun doInBackground(vararg mensajes: MensajeEntity?): Void? {
            for (mensaje in mensajes) {
                if (mensaje != null) mensajeDao.insert(mensaje)
            }
            return null
        }
    }
}