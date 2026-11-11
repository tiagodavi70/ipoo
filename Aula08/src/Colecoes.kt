import kotlin.random.Random

data class Produto(val codigo: String, val preco: Double, val categoria: String)

fun criarAleatorio(n: Int): List<Produto> {
    val produtos = mutableListOf<Produto>()

    val categorias = arrayOf("Eletronico", "Alimenticio", "Higiene")
    repeat(n) {
        val categoria = categorias[Random.nextInt(0,3)]
        produtos.add(Produto(it.toString(), Random.nextDouble(0.0, 500.0), categoria))
    }
    return produtos
}

fun main() {
    val produtos = criarAleatorio(50)

    // preços maior que 100
    for (item in produtos) {
        if (item.preco > 100) {
            println(item)
        }
    }

    val maiorQ100 = produtos.filter {
        it.preco > 100
    }

    println(produtos.sumOf { it.preco })

    val codigos = produtos.map { it.codigo }
    println(codigos)

    val categorias = produtos.groupBy { it.categoria }
    println(categorias)
    println(categorias.get("Eletronico"))
}