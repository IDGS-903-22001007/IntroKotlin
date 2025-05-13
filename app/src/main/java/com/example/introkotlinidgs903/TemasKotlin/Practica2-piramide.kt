package com.example.introkotlinidgs903.TemasKotlin
/*
practica3= imprimir una piramide de * segun el numero dado por el usuario

*
**
***
****
*****
cuando se capture un 0 terminara el programa, utilizando puro do while
*/


fun main() {
    var num: Int

    do {
        println("Ingrese un numero: ")
        num = readln().toInt()

        if (num > 0) {
            var i = 1
            do {
                var j = 1
                do {
                    print(j)
                    j++
                } while (j <= i)
                println()
                i++
            } while (i <= num)
        } else if (num < 0) {
            println("El numero debe ser valido")
        }

    } while (num != 0)

    println("Fin del programa")
}