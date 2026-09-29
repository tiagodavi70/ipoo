package exercicios

// Escreva um programa que receba dois números e imprima
// o menor dos dois.

fun main() {
    print("Entra com o número 1: ")
    val a: Double = readln().toDouble()
    print("Entra com o número 2: ")
    val b: Double = readln().toDouble()

    if (a > b) {
        println("$a é maior que $b")
    } else if (a < b) {
        println("$b é maior que $a")
    } else {
        println("São iguais")
    }
}