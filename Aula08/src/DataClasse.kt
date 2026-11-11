
data class Utilizador(var nome: String, val idade: Int)

class Animal(val nome: String) {

    constructor(animal: Animal): this(animal.nome)
}

fun main() {

    val utilizador1 = Utilizador("Tiago", 34)
    utilizador1.nome = "Davi"

    val animal1 = Animal("Rex")
    val animal2 = Animal(animal1.nome)

    val animal3 = Animal(animal1)

    val utilizador2 = utilizador1.copy(nome="Tiago")

    println(utilizador1)
    println(utilizador2)
}