package exercicios

// Escreva um programa que receba um número indeterminado
// de valores, e apresente o maior e menor entre eles.

fun main() {

    var num: Double = 0.0
    var maior: Double = Double.MIN_VALUE
    var menor: Double = Double.MAX_VALUE

    var entrada:String = ""
    while (entrada != "q") {
        print("Entra com um número (q para sair): ")
        entrada = readln()
        if (entrada != "q") {
            num = entrada.toDouble()
            if (num > maior) {
                maior = num
            }
            if (num < menor) {
                menor = num
            }
        }
    }
    println("$menor $maior")
}