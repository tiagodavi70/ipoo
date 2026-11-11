import java.net.URL

fun main() {

    print("Entra com os dados: ")
    val texto: String? = readln()
    println(texto)

    val num: Int? = texto?.toInt()
    println(num)

    val textoURL = URL("https://raw.githubusercontent.com/tiagodavi70/ipoo/refs/heads/main/README.md").readText()
    println(textoURL)
}