# Padrões de sintaxe e grafia

De modo geral, escreva uma classe em cada ficheiro, a não ser que seja uma _Exception_. Deixe um ficheiro separado para execução.

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
class Utilizador()
class CarroEletrico()
```

Incorreto:
```kotlin
class utilizador()
class carro_eletrico()
```

## Funções em camelCase ou utilizando _

Funções devem indicar ação e se manter consistente.

Correto:

```kotlin
fun calcularTotal(): Double
fun buscarUtilizador(): Usuario

fun calcular_total(): Double
```

Incorreto:

```kotlin
fun Total()
fun Utilizador()
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
