package questao3_4

class PacoteGrande(peso: Double, val tamanho: Double): Pacote(peso) {
    init {
        require(tamanho > 0.0) { "Tamanho negativo" }
    }

    override fun toString(): String {
        return "$peso $tamanho"
    }
}