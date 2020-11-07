package com.everis.pruebasNotificaciones

import android.app.Application
import com.everis.pruebasNotificaciones.di.AppModule
import com.everis.pruebasNotificaciones.di.ApplicationComponent
import com.everis.pruebasNotificaciones.di.DaggerApplicationComponent
import com.everis.pruebasNotificaciones.di.DbModule
import dagger.internal.DaggerCollections

class NotificationApplication:Application() {

lateinit var appComponent:ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        initDaggerComponent()
    }

    private fun initDaggerComponent(){
          appComponent = DaggerApplicationComponent.builder()
                         .appModule(AppModule(this))
                         .dbModule(DbModule()).build()
    }
}