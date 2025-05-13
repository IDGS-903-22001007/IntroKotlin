package com.example.introkotlinidgs903.TemasKotlin
/*
practica4= formula general de la serie de fibonacci (for o do while)
*/

fun main() {
    print("Ingrese el número de términos de la serie: ")
    val n = readLine()?.toIntOrNull() ?: 10
    var t1 = 0
    var t2 = 1

    println("Serie de Fibonacci hasta $n términos:")

    for (i in 1..n) {
        print("$t1 ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}