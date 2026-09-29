//Escreva um algoritmo que, para uma conta bancária,
// leio o seu número, o saldo, o tipo de operação a ser realizada
// (depósito ou levantamento) e o valor da operação.
// Após, determine e mostre o novo saldo.

fun main() {
    val numeroConta:String
    val tipoOperacao:String // D - deposito/ L - levantamento
    var valorConta: Double
    val valorOperacao: Double

    print("Número conta: ")
    numeroConta = readln()
    print("Valor Conta: ")
    valorConta = readln().toDouble()
    print("Tipo de operação\nD - deposito\nL - levantamento\nEntra com a letra: ")
    tipoOperacao = readln()
    print("Valor da operação: ")
    valorOperacao = readln().toDouble()

    if (tipoOperacao == "D") {
        valorConta = valorConta + valorOperacao
    } else {
        valorConta = valorConta - valorOperacao
    }

    println("Valor na conta $numeroConta: $valorConta")
    println("Valor na conta $numeroConta: ${String.format("%.2f", valorConta)}")

}