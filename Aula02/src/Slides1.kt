import java.io.File

// Faça um algoritmo que leia um número N e imprima "F1", "F2" ou "F3", conforme a condição:
//"F1", se N < 10;
//"F2", se N == 10;
//"F3", se N >10

fun main() {

    print("Entra com um número: ")
    val n:Int = readln().toInt()
    if (n < 10) {
        println("F1")
    } else if (n == 10) {
        println("F2")
    } else if (n > 10) {
        println("F3")
    }
}