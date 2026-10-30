package questao2

abstract class Veiculo(val marca: String, val velocidade: Double) {

    override fun toString(): String {
        return "$marca $velocidade"
    }
}