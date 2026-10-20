
# Classes em Kotlin

Construtor Primário Simples

## Construtor primário declarando propriedades diretamente.

```kotlin
class Pessoa(val nome: String, val idade: Int)
```

## Comportamentos

Adição de método de instância.

```kotlin
class Pessoa(val nome: String, val idade: Int) {
    fun cumprimentar() {
        println("Oi, eu sou $nome")
    }
}
```

## Propriedades Declaradas no Corpo

Parâmetros do construtor atribuídos manualmente às propriedades.

```kotlin
class Pessoa(nome: String, idade: Int) {
    val nome: String = nome
    val idade: Int = idade
}
```

## Uso do Bloco init

Inicialização das propriedades dentro do bloco `init`.

```kotlin
class Pessoa(nome: String, idade: Int) {
    val nome: String
    val idade: Int

    init {
        this.nome = nome
        this.idade = idade
    }
}
```

## Construtor Secundário

Classe sem construtor primário, usando construtor secundário.

```kotlin
class Pessoa {
    val nome: String
    val idade: Int

    constructor(nome: String, idade: Int) {
        this.nome = nome
        this.idade = idade
    }
}
```

## Valores Padrão no Construtor

Parâmetros com valores padrão.

```kotlin
class Pessoa(val nome: String = "Desconhecido", val idade: Int = 0)
```

## Validações

Validação de dados no bloco `init` utilizando `require`.

```kotlin
class Pessoa(nome: String, idade: Int) {

    val nome: String
    var idade: Int

    init {
        require(nome.isNotBlank()) { "Nome não pode estar em branco" }
        require(idade >= 0) { "Idade deve ser não negativa" }

        this.nome = nome
        this.idade = idade
    }
}
```

## Encapsulamento

Controle de modificação usando private `set`.
```kotlin
class Pessoa(
    val nome: String,
    idade: Int
) {
    var idade: Int = idade
        private set

    fun aumentarIdade() {
        idade++
    }
}
```

## Recuperar Customizado

Exemplo de propriedade com `get()` definido com corpo de função.
```kotlin
class Pessoa(val nome: String, val anoNascimento: Int) {

    val idade: Int
        get() {
            val anoAtual = java.time.Year.now().value
            return anoAtual - anoNascimento
        }
}
```

## Classe com Regras de Negócio e Validação

Visibilidade `internal`, validações com `require` e `check`, `setter` customizado e normalização.
```kotlin
internal class ContaBancaria(
    val numeroConta: String,
    nomeTitular: String,
    saldoInicial: Double
) {

    val nomeTitular: String
    var saldo: Double = saldoInicial
        private set(valor) {
            require(valor >= 0) { "Saldo não pode ser negativo." }
            field = valor
        }

    init {
        require(numeroConta.length == 10) {
            "Número da conta deve ter 10 dígitos."
        }

        val nomeTratado = nomeTitular.trim()
        require(nomeTratado.isNotBlank()) {
            "Nome do titular não pode estar em branco."
        }
        this.nomeTitular = nomeTratado

        require(saldoInicial >= 0) {
            "Saldo inicial não pode ser negativo."
        }
    }

    fun depositar(valor: Double) {
        require(valor > 0) { "Valor do depósito deve ser positivo." }
        saldo += valor
    }

    fun levantar(valor: Double) {
        require(valor > 0) { "Valor do saque deve ser positivo." }
        check(saldo >= valor) { "Saldo insuficiente." }
        saldo -= valor
    }
}
```

## Exemplos de Uso

Criação de algumas pessoas e duas contas bancárias.

```kotlin
fun main() {

    val pessoa1 = Pessoa("Ana", 25)
    val pessoa2 = Pessoa("Carlos", 32)
    val pessoa3 = Pessoa()

    println(pessoa1.nome)
    println(pessoa2.idade)

    val conta1 = ContaBancaria("1234567890", "Ana Silva", 1000.0)
    val conta2 = ContaBancaria("0987654321", "Carlos Souza", 500.0)

    conta1.depositar(200.0)
    conta2.levantar(100.0)

    println(conta1.saldo)
    println(conta2.saldo)
}
```