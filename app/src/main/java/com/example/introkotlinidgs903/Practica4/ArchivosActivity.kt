package com.example.introkotlinidgs903.Practica4


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

import com.example.introkotlinidgs903.R
import java.io.FileNotFoundException
import java.io.IOException



class ArchivosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_archivos)


        val inputText = findViewById<EditText>(R.id.inputText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val readButton = findViewById<Button>(R.id.readButton)
        val outputText = findViewById<TextView>(R.id.outputText)
        val deleteButton = findViewById<Button>(R.id.btnBorrar)

        saveButton.setOnClickListener{
            val text = inputText.text.toString()+"\n"
            //val archivo = openFileInput("datos.txt", MODE_APPEND)'
            try {
                openFileOutput("datos.txt", MODE_APPEND).use { fileOutput ->
                    fileOutput.write(text.toByteArray())
                }
            }catch (e: IOException){
                e.printStackTrace()
            }
        }


        readButton.setOnClickListener {
            try {
                val fileInput = openFileInput("datos.txt")
                val text = fileInput.bufferedReader().use { it.readText() }
                outputText.text = text
            } catch (e: FileNotFoundException) {
                Toast.makeText(this, "Archivo no encontrado", Toast.LENGTH_SHORT).show()
            } catch (e: IOException) {
                e.printStackTrace()
                Toast.makeText(this, "Error al leer el archivo", Toast.LENGTH_SHORT).show()
            }
        }
    }
}