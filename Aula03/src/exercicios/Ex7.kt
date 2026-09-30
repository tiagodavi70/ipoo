package exercicios

// Escreva um programa que receba um número e
// mostre a média da soma de todos os números até ele.

fun main() {
    print("Entra com um número: ")
    val num:Int = readln().toInt()
    var soma:Double = 0.0
    val media: Double

    for (i in 1..num) {
        soma = soma + i
    }
    media = soma / num
    println("Média dos números até $num: $media")
}