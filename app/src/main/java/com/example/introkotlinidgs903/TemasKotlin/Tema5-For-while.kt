package com.example.introkotlinidgs903.TemasKotlin

fun main() {
    /*
    Range
    1..4= 1,2,3,4
    1..<4= 1,2,3
    4 downTo 1= 4,3,2,1
    1..5 step 2= 1,3,5
    'a' .. 'z' = a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z

     */

    for (num in 1..5) {
        println(num)
    }
    val frutas = listOf("Manzana", "Pera", "Naranja", "Sandia")
    for (fruta in frutas) {
        println(fruta)
    }
    val n=10
    var d=0
    while (d<n){
        println(d)
        d++
    }
    /*
    practica3= imprimir una piramide de * segun el numero dado por el usuario

    *
    **
    ***
    ****
    *****
    cuando se capture un 0 terminara el programa, utilizando puro do while




    practica4= formula general de la serie de fibonacci (for o do while)
     */
}