package questao5

import kotlin.random.Random

fun main() {

    val comboios = mutableListOf<Comboio>()
    for (i in 0..19) {
        comboios.add(Comboio(Random.nextDouble(180.0, 200.0), Random.nextDouble(0.3, 0.5)))
    }
    val avioesArray = Array<Aviao>(20) { Aviao(Random.nextDouble(300.0, 700.0), Random.nextDouble(3.0, 5.0)) }
    val avioes = avioesArray.toList()

    val veiculos = mutableListOf<Transporte>()
    veiculos.addAll(comboios)
    veiculos.addAll(avioes)

    for (item in veiculos) {
        println(item.bilhete(500.0))
        println(item.estimarTempoChegada(500.0))
    }

    for (item in comboios) {
        println(item.bilhete(500.0))
        println(item.estimarTempoChegada(500.0))
    }
    for (item in avioes) {
        println(item.bilhete(500.0))
        println(item.estimarTempoChegada(500.0))
    }
}