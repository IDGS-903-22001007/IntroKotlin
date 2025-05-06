package com.example.introkotlinidgs903.TemasKotlin

fun main() {
  print("ingrese el sueldo del empleado: ")
    val sueldo = readln().toDouble()
    if (sueldo > 3000){
        println("Debe pagar impuestos")
    }else{
        println("No debe pagar impuestos")
    }


}