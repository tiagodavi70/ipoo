fun main() {

    var idade:Int = 0

    while (idade <= 0) {
        println("Entra com a idade:")
        idade = readln().toInt()
        
        if (idade <= 0) {
            println("Idade negativa, entra com a idade de novo.")
        }
    }
    println(idade)
}