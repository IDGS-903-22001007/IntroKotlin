package com.example.introkotlinidgs903.TemasKotlin

class Usuarios() {
    val materia: String = ""

}

class Usuario2(val id: Int, val nombre: String){
    val materia: String = ""
}

fun main() {
    val usuario1 = Usuarios()
    val usuario2 = Usuario2(1, "Juan")


    println(usuario2.id)
    println(usuario2.nombre)

}