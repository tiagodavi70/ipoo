# Exercícios

1. Implemente a classe Felino, e as subclasses Gato, Tigre e Leão. A classe Felino deve ter os atributos `nome` e `peso`, e um método que retorna se é doméstico ou não. Defina como deve ser o construtor de cada subclasse. Defina também usando polimorfismo se o Felino é ou não doméstico. Crie uma classe Zoologico com 40 animais para testar as classes criadas.

1. Leve em consideração a classe abaixo:

``` kotlin
class Automovel(
    val modelo: String,
    var litrosTanque: Double, // litros que ainda estão no tanque
    var litrosKm: Double // consumo de litros por km
) {
    // Dado uma distância em km, calcula os litros utilizados
    fun litrosUtilizados(km: Double): Double {
        val litros = km * this.litrosKm
        consumirTanque(litros)
        return litros
    }

    // Consome a gasolina do tanque
    fun consumirTanque(litros: Double) {
       
    }
}
```

 Termine a função `consumirTanque` e crie uma subclasse `Economico` que usa polimorfismo para diminuir o consumo em `3%`. Crie 50 automóveis e corra 150km com cada um.

3. Das classes `Comodo` e `Casa` do exercicio 1 da aula anterior crie os métodos `toString` usando `override`. Crie 10 casas e apresente as informações sobre elas.


1. Um sistema de pagamentos precisa suportar diferentes formas de pagamento, como cartão de crédito, Débito, MBWay e PayPal. Crie uma classe abstrata para processar os pagamentos, com duas funções - `Realizar pagamento` e `aplicarTaxa` e um atributo - `taxa` e salve o valor final em um atributo - `valorFinal`. Realize 500 pagamentos e apresente a média do valor gasto em cada um dos tipos de pagamento.

1. Em um sistema de gestão de funcionários, temos `Contratado`, `ReciboVerde` e `Estagiário`. Cada um tem um cálculo de salário diferente, baseado no número de horas. Crie uma interface para os pagamentos, que leve em consideração o número de horas e o salário base de cada um. Crie a folha de pagamento de 4 setores com 10 funcionários cada um.

1. Crie um sistema para uma Concessionária de carros. Esse sistema deve ter uma classe abstrata `Automovel` que tem os métodos e atributos necessários para todos os automóveis que são vendidos. Crie mais duas classes `Ligeiro` e `Moto`, que herda de automóvel mas adiciona os atributos necessários. Crie uma interface `Pagamento` para processar pagamentos de cada carro vendido de duas categorias, `Crédito` e `Debito`. Crie 50 carros e faça 30 vendas, apresentando um relatório de vendas ao final.

