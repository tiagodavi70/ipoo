
// Criar um algoritmo que armazene nome e duas notas
// de 5 alunos e imprima uma listagem contendo nome,
// as duas notas e a média de cada aluno.

fun main() {
    val nome = Array<String>(5) { "" }
    val nota1 = Array<Double>(5) { 0.0 }
    val nota2 = Array<Double>(5) { 0.0 }
    val media = Array<Double>(5) { 0.0 }

    for (i in 0..<nome.size) {
        print("Entra com o nome do aluno $i: ")
        nome[i] = readln()
        print("Entra com a nota 1 do aluno $i: ")
        nota1[i] = readln().toDouble()
        print("Entra com a nota 2 do aluno $i: ")
        nota2[i] = readln().toDouble()
    }
    for (i in 0..<nota1.size) {
        media[i] = (nota1[i] + nota2[i] ) / 2
    }
    for (i in 0..<media.size) {
        println("${nome[i]}: ${nota1[i]} | ${nota2[i]} = ${media[i]}")
    }
}