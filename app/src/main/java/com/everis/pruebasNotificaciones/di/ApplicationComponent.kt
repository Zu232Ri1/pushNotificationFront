package com.everis.pruebasNotificaciones.di

import com.everis.pruebasNotificaciones.MainActivity
import dagger.Component
import javax.inject.Singleton


@Component(modules= [AppModule::class,DbModule::class])
@Singleton
interface ApplicationComponent{
   fun inject(mainActivity: MainActivity)
}