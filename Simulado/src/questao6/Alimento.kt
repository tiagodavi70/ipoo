package questao6

class ValidadeException(): Exception("Validade negativa")

class Alimento(nome: String, preco: Double, val validade: Int): Produto(nome, preco) {
    init {
        if (validade < 0.0) {
            throw ValidadeException()
        }
    }
}