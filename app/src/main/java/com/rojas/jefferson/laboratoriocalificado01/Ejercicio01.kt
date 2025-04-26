package com.rojas.jefferson.laboratoriocalificado01

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.content.Intent

class Ejercicio01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejercicio01)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // Encuentra el botón por su ID
        val btnIrTeclado = findViewById<Button>(R.id.btnIrTeclado)
        btnIrTeclado.setOnClickListener {
            // Crea el Intent para ir a Ejercicio02
            val intent = Intent(this, Ejercicio02::class.java)
            startActivity(intent)
        }
    }
}