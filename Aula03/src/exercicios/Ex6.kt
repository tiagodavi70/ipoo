package exercicios

// Escreva um programa que receba n números e tire a
// média entre eles.

// 3, 5, 6
// 1, 3, 9, 15, 20

fun main() {

    var num: Double = 0.0

    var soma: Double = 0.0
    var n: Int = 0
    val media:Double

    var entrada: String = ""
    while (entrada != "q") {
        print("Entra com um número (q para sair): ")
        entrada = readln()
        if (entrada != "q") {
            num = entrada.toDouble()
            soma = soma + num
            n = n + 1
        }
    }
    media = soma / n
    println("Média: $media")
}