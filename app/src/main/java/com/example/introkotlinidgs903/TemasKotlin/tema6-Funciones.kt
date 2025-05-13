package com.example.introkotlinidgs903.TemasKotlin

// Funciones

fun sum(x: Int, y: Int): Int {
    return x + y
}
fun sum2(x: Int, y: Int): Int = x + y



fun saludo() {
    println("Hola mundo")
}
fun main() {
    saludo()
    println("_______________________________________________________________________________________")
    println(sum(2, 3))
    println(sum2(2, 3))
}
