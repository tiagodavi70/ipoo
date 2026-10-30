package questao6

fun main() {
    println("Entra com o nome do alimento: ")
    val nomeAlimento = readln()
    println("Entra com o preço do alimento: ")
    val precoAlimento = readln().toDouble()
    println("Entra com a validade")
    val validade = readln().toInt()

    println("Entra com o nome do eletronico: ")
    val nomeEletronico = readln()
    println("Entra com o preço do eletronico: ")
    val precoEletronico = readln().toDouble()
    println("Tem bateria?")
    val temBateria = readln().toBoolean()

    try {
        val alimento = Alimento(nomeAlimento, precoAlimento, validade)
    } catch(e: ValidadeException) {
        println("Erro: ${e.message}" )
    } catch(e: Exception) {
        println("Erro: ${e.message}" )
    }

    try {
        val eletronico = Eletronico(nomeEletronico, precoEletronico, temBateria)
    } catch(exception: Exception) {
        println("Erro: ${exception.message}" )
    }
}