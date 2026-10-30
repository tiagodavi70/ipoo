import veiculo.*

fun main() {
    val v1 = CarroCombustao("aa", "bb", 200.0)
    val v2 = CarroEletrico("cc", "dd", 200.0)

    println(v1.modelo)
    println(v2.velocidadeMaxima)

    println(v1.mostrarVersao())

    val listaVolantes = arrayOf<Volante>(v1, v2)

    listaVolantes[0].virarEsquerda()
    listaVolantes[1].virarDireita()
    // error listaVolantes[1].velocidadeMaxima

    println(v1)
    println(v2)
}