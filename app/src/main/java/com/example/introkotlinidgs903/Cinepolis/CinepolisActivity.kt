package com.example.introkotlinidgs903.Cinepolis

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.introkotlinidgs903.R

class CinepolisActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cine_polis)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            calcularPago()
        }
    }

    private fun calcularPago() {
        val editNombre = findViewById<EditText>(R.id.editTextText)
        val editCompradores = findViewById<EditText>(R.id.editTextText2)
        val editBoletos = findViewById<EditText>(R.id.editTextText3)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val resultadoTextView = findViewById<TextView>(R.id.textView9)

        try {
            val nombre = editNombre.text.toString()
            val compradoresStr = editCompradores.text.toString()
            val boletosStr = editBoletos.text.toString()

            if (nombre.isBlank() || compradoresStr.isBlank() || boletosStr.isBlank()) {
                Toast.makeText(this, "Por favor ingrese todos los datos", Toast.LENGTH_SHORT).show()
                return
            }

            val compradores = compradoresStr.toInt()
            val boletos = boletosStr.toInt()

            // Lógica modificada para boletos acumulativos
            val limiteBoletos = (compradores + 1) * 7 // +1 porque 0 compradores cuenta como 1

            if (boletos > limiteBoletos) {
                Toast.makeText(this,
                    "Límite: $limiteBoletos boletos (7 por comprador + adicionales)",
                    Toast.LENGTH_LONG).show()
                return
            }

            val precioUnitario = 12000.0
            var precioTotal = boletos * precioUnitario

            // Aplicar descuentos por cantidad
            when {
                boletos > 5 -> precioTotal *= 0.85  // 15% descuento
                boletos in 3..5 -> precioTotal *= 0.90  // 10% descuento
                // 1-2 boletos: sin descuento
            }

            // Descuento adicional por tarjeta Cineco
            val tieneTarjeta = radioGroup.checkedRadioButtonId == R.id.radioButton
            if (tieneTarjeta) {
                precioTotal *= 0.90  // 10% adicional
            }

            // Mostrar resultado con formato mejorado
            val resultado = """
                Nombre: $nombre
                Boletos comprados: $boletos
                Total a pagar: $${"%,.0f".format(precioTotal)}
                Límite disponible: $limiteBoletos boletos
                ${when {
                compradores == 0 -> "Compra base (7 boletos)"
                else -> "$compradores comprador(es) + adicionales"
            }}
            """.trimIndent()

            resultadoTextView.text = resultado

        } catch (e: NumberFormatException) {
            Toast.makeText(this, "Por favor ingrese valores numéricos válidos", Toast.LENGTH_SHORT).show()
        }
    }
}