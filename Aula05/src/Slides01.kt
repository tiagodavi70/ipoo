
// Criar um algoritmo que armazene números em dois vetores
// inteiros de cinco elementos cada. Gere e imprima um vetor
// que some ambos.

fun main() {

    val vetor1 = Array(5) { 0 }
    val vetor2 = Array(5) { 0 }
    val soma = Array(5) { 0 }

    // 0 até o tamanho - 1
    for (i in 0..(5-1)) { // 0 1 2 3 4
        print("Entra com um número para o vetor 1: ")
        val temp:Int = readln().toInt()
        vetor1[i] = temp
    }

    for (i in 0..(5-1)) {
        print("${vetor1[i]} ")
    }

    for (i in 0..(5-1)) {
        print("Entra com o número ${i+1} do vetor 2: ")
        vetor2[i] = readln().toInt()
    }

    for (i in 0..soma.size - 1) {
        soma[i] = vetor1[i] + vetor2[i]
    }

    for (i in 0..soma.size - 1) {
        print("${soma[i]} ")
    }
}