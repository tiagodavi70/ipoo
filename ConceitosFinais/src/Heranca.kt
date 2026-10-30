import pessoa.Colaborador
import pessoa.Pessoa

fun main() {

    val pessoa = Pessoa("Tiago", "999999999", "999999999")
    val colaborador = Colaborador("João", "999999999", "999999999", 1000.0)
    println(colaborador.salario)

    println(pessoa.mostrar())
    println(colaborador.mostrar(true))

    try {
        val pessoa2 = Pessoa("Tiago", "222", "333")
    } catch (e: Exception) {
        println("Entra com os dados de novo.")
    }

    val pessoa3 = Pessoa("Maria", "111111111", "444")

}