package questao2

class Bicicleta(marca: String, velocidade: Double, val nMudancas: Int): Veiculo(marca, velocidade) {
    override fun toString(): String {
        return super.toString() + " $nMudancas"
    }
}