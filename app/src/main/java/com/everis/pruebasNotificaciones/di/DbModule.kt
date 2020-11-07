package com.everis.pruebasNotificaciones.di

import android.content.Context
import com.everis.pruebasNotificaciones.configRoom.DataBaseRoom
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DbModule {
   @Provides
   @Singleton
   fun provaiderMensajesDB(context: Context):DataBaseRoom{
       return DataBaseRoom.getInstance(context)!!
   }

    @Provides
    @Singleton
    fun provaiderMensajesDao(dataBaseRoom:DataBaseRoom) = dataBaseRoom.mensajeDao()


}