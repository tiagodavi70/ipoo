package Exercicios

// Escreva um programa que crie um vetor com 10 posições e
// receba seus valores do usuário. Ao final deverá mostrar
// somente os valores acima da média.

fun main() {

    val numeros = Array(10) { 0.0 }
    var soma: Double = 0.0
    val media: Double

    for (i in 0..numeros.size-1) {
        print("Entra com o número: ")
        numeros[i] = readln().toDouble()
    }

    // soma = numeros.sum()
    soma = 0.0
    for (i in 0..numeros.size-1) {
        soma = soma + numeros[i]
    }
    media = soma / numeros.size
    println("A média é: $media")

    for (i in 0..numeros.size-1) {
        if (numeros[i] > media) {
            println(numeros[i])
        }
    }
}