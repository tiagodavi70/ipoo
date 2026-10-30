package questao3_4

open class Pacote(val peso: Double) {
    init {
        require(peso > 0.0) { "Peso negativo" }
    }

    override fun toString(): String {
        return "$peso"
    }
}