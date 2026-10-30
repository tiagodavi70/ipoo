package questao3_4

fun main() {
    val pacote1 = Pacote(3.0)
    val pacote2 = Pacote(2.0)
    val pacote3 = PacoteGrande(1.0, 20.0)
    val pacote4 = PacoteGrande(3.0, 50.0)

    val listaMutavel = mutableListOf<Pacote>()
    listaMutavel.add(pacote1)
    listaMutavel.add(pacote2)
    listaMutavel.add(pacote3)
    listaMutavel.add(pacote4)

    val lista = listOf<Pacote>(pacote1, pacote2, pacote3, pacote4)

    println(mediaPeso(lista))
}

fun mediaPeso(lista: List<Pacote>): Double {
    var soma: Double = 0.0
    for (item in lista) {
        soma = soma + item.peso
    }
    return soma / lista.size
}