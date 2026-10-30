package questao2

// Crie uma superclasse abstrata para essas entidades, com 2 atributos no mínimo. Para cada
//subclasse adicione um atributo. Crie um programa em Kotlin que crie 1 objetos para cada
//classe criada e apresente na tela as informações sobre eles.

fun main() {
    val aviao = Aviao("aaa", 300.0, "8888")
    val bicicleta = Bicicleta("bbb", 80.0, 5)
    val barco = Barco("ccc", 100.0, 200.0)

    println(aviao)
    println(bicicleta)
    println(barco)
}