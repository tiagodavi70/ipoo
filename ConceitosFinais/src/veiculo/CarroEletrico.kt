package veiculo

class CarroEletrico: Veiculo, Volante {
    constructor(modelo: String, montadora: String, velocidadeMaxima: Double) : super(modelo, montadora, velocidadeMaxima)
    constructor(modelo: String, montadora: String) : super(modelo, montadora)

    override fun acelerar(): Boolean {
        return true
    }

    override fun virarDireita(): String {
        return "direita"
    }

    override fun virarEsquerda(): String {
        return "esquerda"
    }
}

