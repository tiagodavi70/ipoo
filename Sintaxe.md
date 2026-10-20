# Padrões de sintaxe e grafia

## Prefira `val` ao invés de `var`

Use imutabilidade sempre que possível.

Bom:

```kotlin
val nome: String = "Carlos"
```

Evite quando não precisar:

```kotlin
var nome: String = "Carlos"
```

## Indique os tipos de variáveis primitivas

Use os tipos primitovs sempre.

Bom:

```kotlin
val nome: String = "Carlos"
val a: Int = 10
val num: Double = 5.0 
```

Incorreto:

```kotlin
val nome = "Carlos"
val a = 10
val num = 5.0 
```

## Use nomes descritivos

Evite abreviações desnecessárias.

Bom:

```kotlin
val quantidadeDeProdutos: Int = 10
```

Ruim:

```kotlin
val qdp = 10
```

## Classes em PascalCase

Correto:
```kotlin
class Usuario()
class CarroEletrico()
```

Incorreto:
```kotlin
class usuario()
class carro_eletrico()
```

## Funções em camelCase ou utilizando _

Funções devem indicar ação.

Correto:

```kotlin
fun calcularTotal(): Double
fun buscarUsuario(): Usuario

fun calcular_total(): Double
```

Incorreto:

```kotlin
fun Total()
fun Usuario()
```

## Separe com espaços depois de operadores ou vírgulas

Facilita legibilidade.

Correto:

```kotlin
val b = 10.0
soma(1, 2)
```

Incorreto:

```kotlin
val b=10.0
soma(1,2)
```

## Evite classes grandes demais

Se uma classe faz muitas coisas, divida responsabilidades.

Evite:

```kotlin
class Sistema {
    fun salvar()
    fun imprimir()
    fun calcular()
    fun enviarEmail()
}
```

Prefira:

```kotlin
class Calculadora
class Impressora
class EmailService
```

Prefira:

```kotlin
object Configuracao {
    val versao = "1.0"
}
```

## Prefira coleções imutáveis

Recomendado:

```kotlin
val lista = listOf("A", "B", "C")
```

Evite mutável se não precisar:

```kotlin
val lista = mutableListOf("A", "B", "C")
```

## Siga padrão consistente de formatação

* Indentação de espaços consistente no código fonte
* Uma responsabilidade por função
* Linhas não muito longas
* Espaço após `:` e `,`

Exemplo:

```kotlin
fun calcularMedia(n1: Double, n2: Double): Double {
    return (n1 + n2) / 2
}
```
