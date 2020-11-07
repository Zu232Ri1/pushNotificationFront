package com.everis.pruebasNotificaciones.dao

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface MensajeDao {
    @Insert
    fun insert(mensaje: MensajeEntity)

    @Update
    fun update(vararg mensaje: MensajeEntity)

    @Delete
    fun delete(vararg mensaje: MensajeEntity)

    @Query("SELECT * FROM " + MensajeEntity.TABLE_NAME + " ORDER BY id_mensaje")
    fun getOrderedMensajes(): LiveData<List<MensajeEntity>>
}