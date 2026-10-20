
// Criar um algoritmo que armazene cinco nomes em um vetor e
// depois possa ser digitado um nome e, se for encontrado,
// imprimir a posição desse nome no vetor; caso contrário,
// imprimir uma mensagem de não encontrado.

fun main() {
    val nomes = Array(5) { "" }
    val busca:String
    var encontrado: Boolean = false
    var posicao: Int = -1

    for (i in 0..nomes.size-1) {
        print("Entra com o nome $i: ")
        nomes[i] = readln()
    }
    print("Entra com o nome para buscar: ")
    busca = readln()
    for (i in 0..nomes.size-1) {
        if (busca == nomes[i]) {
            encontrado = true
            posicao = i
        }
    }
    if (encontrado) {
        println("Posicao: $posicao")
    } else {
        println("Não encontrado")
    }
}