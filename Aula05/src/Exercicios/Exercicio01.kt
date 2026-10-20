package Exercicios

// Escreva um programa que receba dez nomes do usuário,
// armazene-os em um vetor e ao final mostre a listagem,
// indicando a ordem de entrada de cada nome.

fun main() {
    val nomes = Array(10) { "" }

    for (i in 0..<nomes.size) {
        print("Entra com o nome ${i + 1}: ")
        nomes[i] = readln()
    }

    for (i in 0..<nomes.size) {
        println("${i+1} - ${nomes[i]}")
    }
}