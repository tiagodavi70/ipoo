fun main() {

    var a:Int = 0
    var contadorNegativo:Int = 0

    var i:Int = 0
    while (i < 5) {
        print("Entra com o valor: ")
        a = readln().toInt()
        if (a < 0) {
            contadorNegativo = contadorNegativo + 1
            //contadorNegativo += 1
            //contadorNegativo++
        }
        i = i + 1
    }
}