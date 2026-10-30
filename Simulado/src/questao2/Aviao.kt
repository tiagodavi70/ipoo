package questao2

class Aviao(marca:String, velocidade: Double, val numeroMotor: String): Veiculo(marca, velocidade) {
    override fun toString(): String {
        return super.toString() + " $numeroMotor"
    }
}