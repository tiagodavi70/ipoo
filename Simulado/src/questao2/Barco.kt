package questao2

class Barco(marca: String, velocidade: Double, val combustivel: Double): Veiculo(marca, velocidade) {
    override fun toString(): String {
        return super.toString() + " $combustivel"
    }
}