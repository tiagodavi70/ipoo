
class Carro(val modelo:String, val fabricante:String) {

    fun info():String {
        return "$modelo $fabricante"
    }
}

fun main () {
    val carro1 = Carro("C63", "Mercedes")
    val carro2 = Carro("Corsa", "Opel")
    println(carro1)
    println("${carro1.modelo} ${carro1.fabricante}")
    println(carro2.modelo)
    println(carro2.info())
}