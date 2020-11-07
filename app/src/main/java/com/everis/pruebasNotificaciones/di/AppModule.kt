package com.everis.pruebasNotificaciones.di

import android.content.Context
import com.everis.pruebasNotificaciones.configRoom.DataBaseRoom
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule constructor(private  val context: Context) {
    @Provides
    @Singleton
    fun provaiderMensajesDB(context: Context) = context


}