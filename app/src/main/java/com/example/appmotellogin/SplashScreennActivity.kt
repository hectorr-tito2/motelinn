package com.example.appmotellogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class SplashScreennActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val pantallaInicialCarga = installSplashScreen()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screenn)

        Thread.sleep(3000)
        pantallaInicialCarga.setKeepOnScreenCondition  { true }
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
        //finish()

        /*val content: View = fin//dViewById(android.R.id.content)
        content. */

    }
}