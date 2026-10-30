package veiculo

// abstract class Veiculo(val modelo:String, val montadora: String, val velocidadeMaxima: Double = 120.0)

abstract class Veiculo {

    val modelo: String
    val montadora: String
    val velocidadeMaxima: Double

    private val versao:Double = 10.0

    constructor(modeloFora: String, montadora:String) {
        this.modelo = modeloFora
        this.montadora = montadora
        this.velocidadeMaxima = 120.0
    }

    constructor(modelo: String, montadora: String, velocidadeMaxima: Double) {
        this.modelo = modelo
        this.montadora = montadora
        this.velocidadeMaxima = velocidadeMaxima
    }

    abstract fun acelerar(): Boolean

    fun mostrarVersao(): Double {
        return versao
    }

    override fun toString(): String {
        return "Veiculo: $modelo $montadora $velocidadeMaxima"
    }
}