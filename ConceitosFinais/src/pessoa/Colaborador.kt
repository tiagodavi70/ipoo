package pessoa

class Colaborador(nome: String, nif: String, telemovel: String, val salario: Double) :
    Pessoa(nome, nif, telemovel) {

    override fun mostrar(completo: Boolean): String {
        if (completo) {
            return "$nome $nif $telemovel $salario"
        } else {
            return "$nome"
        }
    }
}