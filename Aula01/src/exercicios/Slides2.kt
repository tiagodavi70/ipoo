package exercicios

// Escreva um algoritmo que receba o nome de uma pessoa,
// seu ano de nascimento e o ano atual. Como saída, exiba o
// nome da pessoa e sua idade atual;

fun main() {
    val nome:String
    val anoNascimento:Int
    val anoAtual:Int
    val idadeAtual: Int

    println("Entra com o nome: ")
    nome = readln()

    println("Entra com o ano de nascimento: ")
    anoNascimento = readln().toInt()

    println("Entra com o ano atual: ")
    anoAtual = readln().toInt()

    idadeAtual = anoAtual - anoNascimento

    println("A idade de $nome é $idadeAtual")
}