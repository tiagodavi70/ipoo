# Exceções em Kotlin

Exceções são usadas para tratar **erros que ocorrem durante a execução do programa**.

Kotlin usa o mesmo modelo de exceções da JVM (Java), mas **não possui checked exceptions**.

## Bloco `try-catch`

O `try` tenta executar um código que pode gerar erro, e o `catch` captura a exceção.

## Exemplo Simples

```kotlin
fun main() {

    try {
        val resultado = 10 / 0
        println(resultado)
    } catch (e: ArithmeticException) {
        println("Erro: divisão por zero.")
    }

}
```

## Uso comum

```kotlin
fun dividir(a: Int, b: Int): Int {

    try {
        return a / b
    } catch (e: ArithmeticException) {
        println("Não é possível dividir por zero.")
        return 0
    }

}

fun main() {
    println(dividir(10, 2))
    println(dividir(10, 0))
}
```

## `try` como expressão

Em Kotlin, `try` **retorna valor**, podendo ser usado diretamente em atribuições.

```kotlin
fun main() {

    val resultado = try {
        10 / 2
    } catch (e: ArithmeticException) {
        0
    }

    println(resultado)
}
```


## Bloco `finally`

O `finally` executa **sempre**, mesmo se ocorrer erro.

Usado normalmente para **fechar recursos**.

```kotlin
fun main() {

    try {
        println("Executando operação...")
        val resultado = 10 / 2
        println(resultado)

    } catch (e: Exception) {
        println("Erro: ${e.message}")

    } finally {
        println("Operação finalizada.")
    }

}
```

## Lançar Exceções (`throw`)

Podemos lançar exceções manualmente com `throw`.

### Exemplo

```kotlin
fun validarIdade(idade: Int) {

    if (idade < 18) {
        throw IllegalArgumentException("Idade mínima é 18 anos.")
    }

}
```

### Uso comum

```kotlin
fun main() {

    try {
        validarIdade(16)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

}
```

## Criando Exceções Personalizadas

Podemos criar nossas próprias exceções herdando de `Exception`.

### Classe de Exceção

```kotlin
class SaldoInsuficienteException(message: String) : Exception(message)
```

### Uso da Exceção

```kotlin
class Conta(var saldo: Double) {

    fun levantar(valor: Double) {

        if (valor > saldo) {
            throw SaldoInsuficienteException("Saldo insuficiente.")
        }

        saldo -= valor
    }

}
```

### Uso comum

```kotlin
fun main() {

    val conta = Conta(100.0)

    try {
        conta.levantar(200.0)
    } catch (e: SaldoInsuficienteException) {
        println("Erro: ${e.message}")
    }

}
```


## Múltiplos `catch`

Podemos tratar diferentes tipos de erro.

```kotlin
fun main() {

    try {

        val numero = "abc".toInt()
        println(numero)

    } catch (e: NumberFormatException) {

        println("Número inválido.")

    } catch (e: Exception) {

        println("Erro inesperado.")

    }

}
```

## `require`, `check` e `error`

Kotlin possui funções utilitárias para validação.

### `require`

Usado para **validar argumentos de função**.

```kotlin
fun dividir(a: Int, b: Int): Int {

    require(b != 0) { "Divisor não pode ser zero." }

    return a / b
}
```

### `check`

Usado para validar **estado interno de um objeto**.

```kotlin
fun processar(lista: List<Int>) {

    check(lista.isNotEmpty()) { "Lista não pode estar vazia." }

    println(lista.first())
}
```

### `error`

Lança exceção diretamente.

```kotlin
fun operacao(): Nothing {
    error("Operação inválida.")
}
```

## Exemplo Final Completo

Conceitos juntos.

```kotlin
class SaldoInsuficienteException(message: String) : Exception(message)

class Conta(private var saldo: Double) {

    fun levantar(valor: Double) {

        require(valor > 0) { "Valor deve ser positivo." }

        if (valor > saldo) {
            throw SaldoInsuficienteException("Saldo insuficiente.")
        }

        saldo -= valor
    }

    fun consultarSaldo(): Double {
        return saldo
    }

}

fun main() {

    val conta = Conta(500.0)

    try {

        conta.levantar(600.0)

    } catch (e: SaldoInsuficienteException) {

        println("Erro: ${e.message}")

    } finally {

        println("Operação encerrada.")

    }

}
```

