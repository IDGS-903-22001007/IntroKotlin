package com.example.introkotlinidgs903

import android.widget.Button
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.content.Intent
import com.example.introkotlinidgs903.Practica1.saludoActivity
import com.example.introkotlinidgs903.Practica2.OperasActivity
import com.example.introkotlinidgs903.Cinepolis.CinepolisActivity
import com.example.introkotlinidgs903.Practica4.ArchivosActivity


class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludo = findViewById<Button>(R.id.btn1)
        btnSaludo.setOnClickListener {navegateToSaludo()}

        val btnOpera = findViewById<Button>(R.id.btn2)
        btnOpera.setOnClickListener {navegateToOpera()}

        val btnCinePolis = findViewById<Button>(R.id.btncinepolis)
        btnCinePolis.setOnClickListener {navegateToCine()}

        val btnArchivos = findViewById<Button>(R.id.btnArchivos)
        btnArchivos.setOnClickListener {navegateToArchivos()}

        val btnAleatorio = findViewById<Button>(R.id.btnaleatorio)
        btnAleatorio.setOnClickListener {navegateToAleatorio()}

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToAleatorio() {
        val intent = Intent(this, ejemplo3Activity::class.java)
        startActivity(intent)    }

    private fun navegateToArchivos() {
        val intent = Intent(this, ArchivosActivity::class.java)
        startActivity(intent)    }


    private fun navegateToCine() {
        val intent = Intent(this, CinepolisActivity::class.java)
        startActivity(intent)    }

    private fun navegateToOpera() {
        val intent = Intent(this, OperasActivity::class.java)
        startActivity(intent)    }

    private fun navegateToSaludo() {
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }
}