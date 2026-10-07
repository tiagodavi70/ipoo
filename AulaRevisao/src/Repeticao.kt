
fun main() {
    for (i in 1..100) {
        print("$i ")
    }
    println()

    var i:Int = 1
    while (i <= 100) {
        print("$i ")
        i = i + 1
    }
    println()
    var letra:String = ""
    while (letra != "a" && letra != "b") {
        print("Entra com uma opção (a ou b): ")
        letra = readln()
    }
}