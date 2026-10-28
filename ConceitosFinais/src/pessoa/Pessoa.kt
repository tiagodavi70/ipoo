package pessoa

open class Pessoa(val nome: String, val nif: String, val telemovel: String) {

    init {
        check(nome.isNotEmpty())
        require(nif.length == 9)
        require(telemovel.length >= 9)
    }

    fun mostrar():String {
        return nome
    }

    open fun mostrar(completo: Boolean):String {
        if (completo) {
            return "$nome $nif $telemovel"
        } else {
            return "false " + nome
        }
    }
}