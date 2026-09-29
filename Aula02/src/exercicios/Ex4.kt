package exercicios

// Escreva um programa que receba um número e verifique se é
// divísivel por 6.

fun main() {
    print("Entra com o número: ")
    val numero:Int = readln().toInt()

    if (numero % 2 == 0 && numero % 3 == 0) {
        println("$numero é divísivel por 6.")
    } else {
        println("$numero não é divísivel por 6.")
    }
}