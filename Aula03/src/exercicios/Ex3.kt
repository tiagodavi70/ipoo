package exercicios

// Escreva um programa que apresente na tela as tabuadas
// de 1 até 10.

fun main() {

    for (j in 1..10) {
        for (i in 1..10) {
            println("$j x $i = ${j * i}")
        }
        println()
    }
}