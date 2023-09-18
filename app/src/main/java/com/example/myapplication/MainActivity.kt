package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        val texto = findViewById<TextView>(R.id.texto1)

        val boton = findViewById<Button>(R.id.buttonHola)

        val boton2 = findViewById<Button>(R.id.buttonAdios)



        boton.setOnClickListener{
            texto.text= "Hola Mundo!"
        }

        boton2.setOnClickListener{
            texto.text= "Adiós Mundo!"
        }



    }
}