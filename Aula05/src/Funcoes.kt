

fun main() {
    val soma = 4 + 5
    println(soma(10, 20))

    val v1 = arrayOf(2,3,4,5)
    val v2 = arrayOf(3,7,8,9)

    println(soma(v1, v2).toList())
}

fun soma(a:Int, b:Int): Int {
    return a + b
}

fun soma(vetorA: Array<Int>, vetorB: Array<Int>): Array<Int> {
    if (vetorA.size != vetorB.size) {
        throw Exception("Vetores não tem o mesmo tamanho")
    }
    // require(vetorA.size == vetorB.size)
    val soma = Array<Int>(vetorA.size) { 0 }
    for (i in 0..<vetorA.size) {
        soma[i] = vetorA[i] + vetorB[i]
    }
    return soma
}