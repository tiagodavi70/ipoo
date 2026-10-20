
fun main() {

    val vetor = Array(2) { 0 }
    val matriz = Array(2) { Array(2) { 0 } }

    for (i in 0..matriz.size-1) {
        for (j in 0..matriz[i].size - 1) {
            print("indices: $i $j: ${matriz[i][j]} ")
        }
        println()
    }

    for (i in 0..matriz.size-1) {
        for (j in 0..matriz[i].size-1) {
            print("Entra com o valor da posicao $i $j: ")
            matriz[i][j] = readln().toInt()
        }
    }

    for (i in 0..matriz.size-1) {
        for (j in 0..matriz[i].size - 1) {
            print("${matriz[i][j]} ")
        }
        println()
    }
}