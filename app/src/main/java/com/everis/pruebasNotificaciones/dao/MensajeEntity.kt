package com.everis.pruebasNotificaciones.dao

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import org.jetbrains.annotations.NotNull

@Entity(tableName = MensajeEntity.TABLE_NAME)
data class MensajeEntity(
    @ColumnInfo(name = "mensaje") @NotNull val mensaje: String,
    @ColumnInfo(name = "dispositivo") val dispositivo: String? = null
) {
    companion object {
        const val TABLE_NAME = "mensajes"
    }

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_mensaje")
    var id_mensaje: Int = 0
}