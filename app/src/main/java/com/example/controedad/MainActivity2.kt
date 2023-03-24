package com.example.controedad

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myBlunder: Bundle? = this.intent.extras


        val saludo: TextView = findViewById(R.id.saludo)
        saludo.text = "Hola ${myBlunder?.getString("nombre")}"

        val datoPersonal: TextView = findViewById(R.id.dataPersonal)
        datoPersonal.text = "Direccion: ${myBlunder?.getString("direccion")}\nTelefono: ${myBlunder?.getString("telefono")}\nEmail: ${myBlunder?.getString("email")}\nDocumento: ${myBlunder?.getString("documento")}\nEdad: ${myBlunder?.getString("edad")}"

        val mensaje: TextView = findViewById(R.id.resultado)
        var mensajeEdad = myBlunder?.getString("mensaje")
        mensaje.text = mensajeEdad

        Toast.makeText(this, "nombre: ${myBlunder?.getString("nombre")}\n" +
                " Direccion: ${myBlunder?.getString("direccion")}\n " +
                " Telefono: ${myBlunder?.getString("telefono")}\n" +
                " Correo: ${myBlunder?.getString("email")}\n" +
                " Documento: ${myBlunder?.getString("documento")}\n" +
                "Edad: ${myBlunder?.getString("edad")}", Toast.LENGTH_SHORT).show()


        val button: Button = findViewById(R.id.salir)
        button.setOnClickListener { onClick() }
    }

    private fun onClick() {
        finish()
    }
}

