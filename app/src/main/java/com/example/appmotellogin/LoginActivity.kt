package com.example.appmotellogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {

            val intent: Intent = Intent(this, MenuPrincipal:: class.java)
            startActivity(intent)
            //se declara boton ingresar --> se da acción al boton para ingresar a 2da pantalla


        }
    }
}

//cuenta de google cloud para api Email   : titoappmotel2@gmail.com
//                                password: 2Wsx1Qaz