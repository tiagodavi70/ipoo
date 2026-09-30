package exercicios

fun main() {
    for (i in 10..10000 step 10) {
        print("$i ")
    }
    println()
    for (i in 1..10000/10) {
        print("${i*10} ")
    }
    println()
    for (i in 1..10000) {
        if (i % 10 == 0)
            print("$i ")
    }
}