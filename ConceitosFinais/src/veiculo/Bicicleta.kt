package veiculo

class Bicicleta(modelo: String, montadora: String, velocidadeMaxima: Double): Veiculo(modelo, montadora, velocidadeMaxima) {

    override fun acelerar(): Boolean {
        return true
    }
}