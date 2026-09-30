package exercicios

// Escreva um programa que receba um número indeterminado de
// valores, e conte os números entre 50 e 150.

fun main() {
    var num: Double = 0.0
    var contador: Int = 0

    var entrada: String = ""
    while (entrada != "q") {
        print("Entra com um número (q para sair):")
        entrada = readln()
        if (entrada != "q") {
            num = entrada.toDouble()
            if (num > 50 && num < 150) {
                contador += 1
            }
        }
    }
    println("Contador: $contador")
}
