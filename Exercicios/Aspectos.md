1. Cria uma classe Produto com:
- nome: String
- preco: Double
- quantidade: Int
Implementa funcionalidades para: Guardar e ler produtos num ficheiro. Procurar um produto pelo nome e calcular o valor total do stock.

2. Cria uma data class Funcionario com:
- nome: String
- idade: Int
- salario: Double
- departamento: String
Cria uma lista com pelo menos 500 funcionários e pelo menos 3 departamentos. Implementa as seguintes operações:
 Mostrar todos os funcionários.  
 Filtrar funcionários com salário superior a 1500€.  
 Ordenar os funcionários por salário (sortedBy).  
 Encontrar o funcionário mais velho (maxByOrNull).  
 Calcular a média salarial (average).  
 Agrupar funcionários por departamento (groupBy).  


3. Cria um programa para gerir uma biblioteca. Cria uma data class Livro com:
- titulo: String
- autor: String
- ano: Int
- disponivel: Boolean
Guarda os livros num ficheiro biblioteca.txt.  
Implementa funções para:
- Adicionar livros.
- Listar todos os livros.
- Procurar um livro pelo título.
- Remover um livro.
- Emprestar um livro.  
Utiliza a API de coleções para:
- Filtrar livros disponíveis.
- Ordenar livros por ano.
- Encontrar o livro mais antigo.  
Utilize operadores de nulidade para tratar pesquisas sem resultados.