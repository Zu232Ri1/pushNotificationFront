package com.everis.pruebasNotificaciones.configRoom

import android.content.Context

import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.everis.pruebasNotificaciones.dao.MensajeDao
import com.everis.pruebasNotificaciones.dao.MensajeEntity

@Database(entities = [MensajeEntity::class], version = 1)
abstract class DataBaseRoom : RoomDatabase() {
    abstract fun mensajeDao(): MensajeDao


    companion object {
        private const val DATABASE_NAME = "score_database"
        @Volatile
        private var INSTANCE: DataBaseRoom? = null

        fun getInstance(context: Context): DataBaseRoom? {
            INSTANCE ?: synchronized(this) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    DataBaseRoom::class.java,
                    DATABASE_NAME
                ).build()
            }
            return INSTANCE
        }
    }

}