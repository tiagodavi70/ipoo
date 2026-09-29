package exercicios

// Escreva um programa que receba um número e mostre qual o mês correspondente.

fun main() {
    print("Entra com o número: ")
    val mes: Int = readln().toInt()
    if (mes == 1) {
        println("Janeiro")
    } else if (mes == 2) {
        println("Fevereiro")
    } else if (mes == 3) {
        println("Março")
    } else if (mes == 4) {
        println("Abril")
    } else if (mes == 5) {
        println("Maio")
    } else if (mes == 6) {
        println("Junho")
    } else if (mes == 7) {
        println("Julho")
    } else if (mes == 8) {
        println("Agosto")
    } else if (mes == 9) {
        println("Setembro")
    } else if (mes == 10) {
        println("Outubro")
    } else if (mes == 11) {
        println("Novembro")
    } else if (mes == 12) {
        println("Dezembro")
    } else {
        print("Número inválido")
    }

    when (mes) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Número inválido")
    }

}