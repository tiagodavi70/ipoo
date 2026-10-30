package questao6

// Escreva uma classe abstrata chamada Produto. Um Produto deve conter:
//• Um nome
//• Um preço
//O nome não pode ter somente 1 caracter, deve ser lançada uma exceção caso tenha menos
//que dois caracteres. No caso de preço ser negativo deve ser lançada uma exceção, e como o
//preço também pode ser atualizado, deve ter métodos get e set para encapsulamento.
//Escreva as classes Alimento e Eletronico, subclasses de Produto
//• Alimento deve conter um atributo com uma validade em dias (int). Se a validade for
//negativa deve lançar uma exceção ValidadeException.
//• Eletronico deve conter um campo que indica se tem ou não tem bateria (boolean).
//Crie também um programa que crie 1 alimento e um 1 eletronico com entradas do utilizador.
//Deve tratar as exceções indicando o erro encontrado.


abstract class Produto(val nome: String, val preco: Double) {
    init {
        require(nome.length > 1) { "Nome muito pequeno" }
        require(preco > 0.0) { "Preço negativo" }
    }
}

