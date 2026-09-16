package exercicios

// Escreva um algoritmo que leia a idade de uma pessoa expressa em
// anos (365), meses (30) e dias e mostre-a expressa apenas em dias.

fun main() {
    val anos: Int
    val meses: Int
    val dias: Int

    val somenteDias: Int

    println("Entra com a quantidade de anos: ")
    anos = readln().toInt()
    println("Entra com a quantidade de meses: ")
    meses = readln().toInt()
    println("Entra com a quantidade de dias: ")
    dias = readln().toInt()

    somenteDias = anos * 365 + meses * 30 + dias
    println("Somente dias: $somenteDias")
}