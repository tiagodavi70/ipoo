package exercicios

// Escreva um algoritmo que receba dois números inteiros como
// entrada e forneça como saída a soma desses números

fun main() {

    print("Entra com o primeiro número: ")
    val a:Int = readln().toInt()

    print("Entra com o segundo número: ")
    val b:Int = readln().toInt()
    var soma:Int

    soma = a + b

    println("A soma de $a + $b é $soma")
}