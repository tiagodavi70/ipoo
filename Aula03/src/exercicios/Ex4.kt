package exercicios

// Escreva um programa que receba dois números e mostre o
// somatório dos números entre eles.

fun main() {
    print("Entra com um número: ")
    val a: Int = readln().toInt()

    print("Entra com um número: ")
    val b: Int = readln().toInt()

    var soma: Int = 0
    // (5 10) = 5 + 6 + 7 + 8 + 9 + 10
    for (i in a..b) {
        soma = soma + i
    }
    println("Somatório entre $a e $b = $soma ")
}