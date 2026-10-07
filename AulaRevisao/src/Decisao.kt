
fun main() {

    print("Entra com a idade: ")
    val idade:Int = readln().toInt()

    if (idade >= 18) {
        println("Pode votar.")
    } else {
        println("Não pode votar.")
    }

}