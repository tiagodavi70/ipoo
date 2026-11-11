import java.io.File

fun main() {
    val ficheiro = File("ficheiros/ficheiro.txt")

    ficheiro.createNewFile()

    ficheiro.writeText("Olá mundo")

    println(ficheiro.readText())

}