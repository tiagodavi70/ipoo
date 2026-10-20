package Exercicios

import kotlin.random.Random

// Escreva um programa que crie um vetor com 20 valores
// inteiros aleatórios (entre 0 e 999).

fun main() {
    //Random.nextDouble()
    //println(Random.nextInt())
    println(Random.nextInt(0,1000))

    val vetor = Array(20) { Random.nextInt(0, 1000) }
    println(vetor.toList())
}