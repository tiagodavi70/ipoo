package exercicios

// Escreva um programa que receba três números e mostre na tela em ordem crescente

fun main() {
    print("Entra com a: ")
    val a: Double = readln().toDouble()
    print("Entra com b: ")
    val b: Double = readln().toDouble()
    print("Entra com c: ")
    val c: Double = readln().toDouble()

    arrayOf(1,2,3).sort()

    if (a > b && a > c) {
        if (b > c) {
            println("$a > $b > $c")
        } else {
            println("$a > $c > $b")
        }
    } else if (b > a && b > c) {
        if (a > c) {
            println("$b > $a > $c")
        } else {
            println("$b > $c > $a")
        }
    } else {
        if (a > b) {
            println("$c > $a > $b")
        } else {
            println("$c > $b > $a")
        }
    }
}