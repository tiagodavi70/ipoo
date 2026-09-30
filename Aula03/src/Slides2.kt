
// Escreva um algoritmo que lê 5 valores para a, um de cada vez,
// e conta quantos destes valores são negativos, escrevendo
// essa  informação.

fun main() {

    var a: Int = 0
    var contadorNegativo: Int = 0

    for (i in 1..10 step 2) {
        print("$i ")
    }

    println("menor que")
    for (i in 1..<5) {
        print("$i ")
    }
    for (i in 1..10) {
        print("$i ")
    }
    for (i in 1..5) {
        print("Entra com o valor: ")
        a = readln().toInt()
        if (a < 0) {
            contadorNegativo = contadorNegativo + 1
            //contadorNegativo += 1
            //contadorNegativo++
        }
    }
    println("O número de negativos é: $contadorNegativo")
}