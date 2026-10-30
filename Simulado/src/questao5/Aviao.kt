package questao5

class Aviao(val kmh: Double, val valorBilhete: Double): Transporte {
    override fun bilhete(distanciaKm: Double): Double {
        return distanciaKm * valorBilhete
    }

    override fun estimarTempoChegada(distanciaKm: Double): Double {
        return distanciaKm / kmh
    }
}