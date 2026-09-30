package exercicios

// Escreva um programa que escreva a sequência de Fibonacci
// até 1000.

// fibo1 fibo2

// 1 1 2 3 5 8 13

fun main() {

    var fibo1: Int = 1
    var fibo2: Int = 1
    print("1 1 ")
    while (fibo1 + fibo2 < 1000) {
        val temp = fibo1
        fibo1 = fibo1 + fibo2
        fibo2 = temp
        // print("$fibo1 + $fibo2 = ${fibo1 + fibo2}")
        print("$fibo1 ")
    }
}