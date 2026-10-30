package pessoa

class NIFSizeException(message: String, val pessoa: Pessoa): Exception(message) // Erro genérico -> mensagem genérica
//class NIFSizeException(): Exception("NIF não tem 9 caracteres") // Erro específico

open class Pessoa(val nome: String, val nif: String, val telemovel: String) {

    init {
        check(nome.isNotEmpty())
        //require(nif.length == 9) { "NIF não tem 9 caracteres" }
        if (nif.length != 9) {
            throw NIFSizeException("NIF não tem 9 caracteres", this)
        }
        require(telemovel.length >= 9) { "Telemóvel tem menos de 9 caracteres" }
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