
fun main() {

    val lista = listOf<Int>(1,2,3,4)
    val array = arrayOf(1,2,3,4)

    val listaVazia = ArrayList<Int>()
    println(listaVazia)

    val listaMutavel = MutableList<Int>(0) {0}

    listaMutavel.add(4)
    listaMutavel.add(5)
    listaMutavel.add(6)

    println(listaMutavel)

    listaMutavel.remove(4)
    listaMutavel.removeAt(0)

    println(listaMutavel)
}