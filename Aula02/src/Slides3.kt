//Faça um algoritmo que leia um inteiro e mostre uma mensagem indicando
// se este número é par ou ímpar.

fun main() {
    print("Entra com o número: ")
    val numero:Int = readln().toInt()

    // %
    if (numero % 2 == 0) {
        println("Ele é par")
    } else {
        println("Ele é ímpar.")
    }

}