package com.example.introkotlinidgs903.TemasKotlin


fun main() {
    /*
    List  - val()
    MutableList - var
    Set- valores duplicados
    MutableSet
    Map - clave y valor (no mutables)
    MutableMap (mutables)

     */
    val lista = listOf<String>("Lunes", "Martes", "Miercoles")
    println(lista)
    println(lista.size)
    println(lista.count())
    println(lista.get(0))
    println(lista[1])
    println(lista.indexOf("Miercoles"))
    println(lista.first())
    println(lista.last())

    var listamutable = mutableListOf<String>("Lunes", "Martes", "Miercoles")
    println(listamutable)
    listamutable.add("Jueves")
    println(listamutable)
    listamutable.removeAt(0)
    println(listamutable)
    listamutable.add(0, "Domingo")
    println(listamutable)
    listamutable.remove("Miercoles")
}