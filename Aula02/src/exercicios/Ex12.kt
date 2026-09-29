package exercicios

// Um comerciante calcula o valor da venda, tendo em vista a tabela a seguir:
//Compra 	Valor da Venda
//menor que €10 	Lucro de 70%
//entre €10 e €30 	Lucro de 50%
//entre €30 e €50 	Lucro de 40%
//maior que €50 	Lucro de 30%
//
//Escreva um programa que possa entrar com nome do produto e valor da compra e imprimir o nome do produto e valor de venda.

fun main() {
    println("Entra com o valor")
    val valorCompra: Double = readln().toDouble()
    val valorVenda: Double

    if (valorCompra > 0 && valorCompra < 10) {
        valorVenda = valorCompra * 1.7
    } else if (valorCompra > 10 && valorCompra <= 30) {
        valorVenda = valorCompra * 1.5
    } else if (valorCompra > 30 && valorCompra <= 50) {
        valorVenda = valorCompra * 1.4
    } else if (valorCompra > 50) {
        valorVenda = valorCompra * 1.3
    } else {
        println("Valor inválido")
        valorVenda = valorCompra
    }
    println("$valorCompra -> $valorVenda")

//    when (valorCompra.toInt()) {
//        in  0..10 -> valorVenda = valorCompra * 1.7
//        in 10..30 -> valorVenda = valorCompra * 1.7
//        in 30..50 -> valorVenda = valorCompra * 1.7
//    }

//    when {
//        valorCompra < 10 -> valorVenda = valorCompra * 1.7
//        valorCompra.toInt() in 10..30 -> valorVenda = valorCompra * 1.5
//        valorCompra.toInt() in 30..50 -> valorVenda = valorCompra * 1.4
//        valorCompra > 50 -> valorVenda = valorCompra * 1.3
//        valorCompra < 0 -> {
//            println("Número inválido")
//        }
//    }
}
