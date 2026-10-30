package questao5

// Crie uma interface Transporte, com os métodos bilhete e estimarTempoChegada. Ambas
//recebem distanciaKm como argumento, que é a distância em quilômetros até o destino. Crie
//dois meios de transporte que implementam Transporte: Comboio e Avião. O Comboio tem
//atributos de quilômetros por hora e valor de bilhete por cada 10 quilômetros. O Avião tem
//atributos de quilômetros por hora e valor de bilhete por quilômetro. Crie 20 objetos em uma lista de cada
//classe, com valores aleatórios para cada objeto e apresente na tela o preço do bilhete e tempo
//estimado para todos esses objetos.

interface Transporte {
    fun bilhete(distanciaKm: Double): Double // volta o preco
    fun estimarTempoChegada(distanciaKm: Double): Double // volta o tempo
}