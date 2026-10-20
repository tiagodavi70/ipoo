# Herança em Kotlin

Em Kotlin, classes são `final` por padrão. Para permitir herança, é necessário usar `open`.

## Classe Base Aberta (Classe pai, mãe)

```kotlin
open class Funcionario(val nome: String, var salario: Double) {
    open fun calcularBonus(): Double {
        return salario * 0.1
    }
}
```

## Classe Derivada (classe filha)

```kotlin
class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {

    override fun calcularBonus(): Double {
        return salario * 0.2
    }
}
```

## Uso Comun

```kotlin
fun main() {
    val gerente = Gerente("Mariana", 5000.0)
    println(gerente.calcularBonus())
}
```

## Classes Abstratas em Kotlin

Classes abstratas não podem ser instanciadas diretamente e podem conter métodos abstratos e concretos.


### Classe Abstrata

```kotlin
abstract class Animal(val nome: String) {

    abstract fun emitirSom()

    fun dormir() {
        println("$nome está a dormir.")
    }
}
```

### Implementação de Classe Abstrata 

A implementação é por meio de herança.

```kotlin
class Cachorro(nome: String) : Animal(nome) {

    override fun emitirSom() {
        println("Au au!")
    }
}
```

### Uso Comun

```kotlin
fun main() {
    val cachorro = Cachorro("Rex")
    cachorro.emitirSom()
    cachorro.dormir()
}
```

## Interfaces em Kotlin

Interfaces definem comportamentos que as classes devem implementar.


### Interface Simples

```kotlin
interface Voador {
    fun voar()
}
```

### Interface com Implementação Padrão

```kotlin
interface Nadador {
    fun nadar() {
        println("Está a nadar.")
    }
}
```


### Implementação de Interfaces

```kotlin
class Pato : Voador, Nadador {

    override fun voar() {
        println("O pato está a voar.")
    }
}
```

### Uso comum

```kotlin
fun main() {
    val pato = Pato()
    pato.voar()
    pato.nadar()
}
```

## Polimorfismo em Kotlin

Polimorfismo permite tratar objetos diferentes através de um mesmo tipo base.

### Polimorfismo com Herança

```kotlin
open class Funcionario(val nome: String, var salario: Double) {
    open fun calcularBonus(): Double {
        return salario * 0.1
    }

    override fun toString(): String {
        return "Funcionário: $nome | Salário: $salario | Bónus: ${calcularBonus()}"
    }
}

class Gerente(nome: String, salario: Double) : Funcionario(nome, salario) {

    override fun calcularBonus(): Double {
        return salario * 0.2
    }

    override fun toString(): String {
        return "Gerente: $nome | Salário: $salario | Bónus: ${calcularBonus()}"
    }
}

fun main() {

    val funcionarios: List<Funcionario> = listOf(
        Funcionario("João", 3000.0),
        Gerente("Maria", 5000.0)
    )

    for (funcionario in funcionarios) {
        println(funcionario)
    }
}
```

Mesmo sendo do tipo `Funcionario`, o método correto é executado em tempo de execução.

### Polimorfismo com Interface

```kotlin
interface Pagavel {
    fun calcularPagamento(): Double

    fun exibirPagamento() {
        println("Pagamento a receber: ${calcularPagamento()}")
    }
}

class Freelancer(val valorHora: Double, val horas: Int) : Pagavel {

    override fun calcularPagamento(): Double {
        return valorHora * horas
    }
}

class Empregado(val salarioMensal: Double) : Pagavel {

    override fun calcularPagamento(): Double {
        return salarioMensal
    }
}
```

## Controle de Acesso em Kotlin

Modificadores de visibilidade controlam onde elementos podem ser acessados.


### Tabela de Modificadores

| Modificador | Visibilidade                |
| ----------- | --------------------------- |
| `public`    | Todo o projeto (padrão)     |
| `private`   | Apenas na classe ou arquivo |
| `protected` | Classe e subclasses         |
| `internal`  | Mesmo módulo                |


### Uso comun

```kotlin
open class Pessoa(public val nome: String, protected var idade: Int, private val cpf: String) {

    internal fun apresentar() {
        println("Olá, meu nome é $nome")
    }

    fun exibirIdade() {
        println("$nome tem $idade anos.")
    }

    private fun exibirCpf() {
        println("CPF: $cpf")
    }

    fun mostrarDados() {
        exibirIdade()
        exibirCpf()
    }
}
```

## Exemplo Final Completo

Conceitos todos juntos.

### Interface

```kotlin
interface Pagavel {
    fun calcularPagamento(): Double
}
```

### Classe Abstrata

```kotlin
abstract class Colaborador(val nome: String) : Pagavel {

    abstract fun descricaoCargo(): String
}
```

### Classes Concretas

```kotlin
class Desenvolvedor(nome: String, private val salario: Double) : Colaborador(nome) {

    override fun calcularPagamento(): Double {
        return salario
    }

    override fun descricaoCargo(): String {
        return "Desenvolvedor"
    }

    override fun toString(): String {
        return "Nome: $nome | Cargo: ${descricaoCargo()} | Pagamento: ${calcularPagamento()}"
    }
}

class Designer(nome: String, private val valorHora: Double, private val horas: Int) : Colaborador(nome) {

    override fun calcularPagamento(): Double {
        return valorHora * horas
    }

    override fun descricaoCargo(): String {
        return "Designer"
    }

    override fun toString(): String {
        return "Nome: $nome | Cargo: ${descricaoCargo()} | Pagamento: ${calcularPagamento()}"
    }
}

class Gerente(nome: String, private val salario: Double, private val bonus: Double) : Colaborador(nome) {

    override fun calcularPagamento(): Double {
        return salario + bonus
    }

    override fun descricaoCargo(): String {
        return "Gerente"
    }

    override fun toString(): String {
        return "Nome: $nome | Cargo: ${descricaoCargo()} | Pagamento: ${calcularPagamento()}"
    }
}

class Estagiario(nome: String, private val bolsa: Double) : Colaborador(nome) {

    override fun calcularPagamento(): Double {
        return bolsa
    }

    override fun descricaoCargo(): String {
        return "Estagiário"
    }

    override fun toString(): String {
        return "Nome: $nome | Cargo: ${descricaoCargo()} | Pagamento: ${calcularPagamento()}"
    }
}
```

### Utilização com Polimorfismo

```kotlin
fun main() {

    val colaboradores: List<Colaborador> = listOf(
        Desenvolvedor("Ana", 4000.0),
        Designer("Carlos", 50.0, 80),
        Gerente("Mariana", 8000.0, 1500.0),
        Estagiario("Pedro", 800.0)
    )

    for (colaborador in colaboradores) {
        println(colaborador)
    }

    var totalFolha = 0.0
    for (colaborador in colaboradores) {
        totalFolha += colaborador.calcularPagamento()
    }
    println("Total da folha de pagamento: $totalFolha")
}
```

