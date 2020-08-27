package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//Este import
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //AQUI COMENZAMOS CON TODa LA LOGICA

        Eventos()
    }

    fun Eventos(){

        //SE hace de esta manera en Java
        /*var boton = findViewById<Button>(R.id.btnAceptar)
        boton.setOnClickListener {

        }

         */
        //citamos nuestro botón
        btnAceptar.setOnClickListener {
            var nombre = txtNombre.text
            lblDato.text = "éste es tu nombre: $nombre"
        }
    }

}