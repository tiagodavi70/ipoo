
fun calcular(a:Int, b:Int, operacao: (Int, Int) -> Int ) : Int {
    return operacao(a,b)
}

fun main() {

    val triplicar: (Int) -> Int = { it * 3 }
    val somar: (Int, Int) -> Int = {a, b -> a + b}

    val n = triplicar(8)
    println(n)

    println(calcular(10, 20, somar))
}