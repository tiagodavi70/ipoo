package exercicios

// Escreva um programa que mostre os números de 1 até 100,
// e de 100 até 1.

fun main() {

    for (i in 1..100) {
        print("$i ")
    }
    println()
    for (i in 100 downTo 1) {
        print("$i ")
    }
    println()
    for (i in 1..100) {
        print("${100 - (i-1)} ")
    }
    println()
    var i:Int = 100
    while (i >= 1) {
        print("$i ")
        i = i - 1
    }
}