package questao5

class Comboio(val kmh: Double, val valorBilhete: Double): Transporte {
    override fun bilhete(distanciaKm: Double): Double {
        return (distanciaKm / 10) * valorBilhete
    }

    override fun estimarTempoChegada(distanciaKm: Double): Double {
        return distanciaKm / kmh
    }
}