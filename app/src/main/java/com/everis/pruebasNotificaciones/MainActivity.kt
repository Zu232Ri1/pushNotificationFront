package com.everis.pruebasNotificaciones


import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.Settings.Secure
import android.util.Log
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.iid.FirebaseInstanceId
import java.lang.Exception;

class MainActivity : AppCompatActivity() {
    private val loadingsRequested = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val id =
            Secure.getString(getContentResolver(), Secure.ANDROID_ID)

        Log.d("MainActivity",id);


        FirebaseInstanceId.getInstance().instanceId
            .addOnSuccessListener { instanceIdResult ->
                val deviceToken = instanceIdResult.token
                // Do whatever you want with your token now
                // i.e. store it on SharedPreferences or DB
                // or directly send it to server
                Log.d("MainActivity","token "+deviceToken);
            }


    }
}
