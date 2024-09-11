# Introdução
A alocação de memória para tipos primitivos é um conceito fundamental na programação e na administração de sistemas. Tipos primitivos, como inteiros, caracteres e valores booleanos, são os blocos básicos de construção de dados em muitas linguagens de programação. Eles têm tamanhos e comportamentos bem definidos, o que facilita a alocação eficiente de memória.

# Uso eficiente
No kotlin ao definirmos que a variável é um Int, estamos alocando um espaço de 32 bits para aquela variável. No entanto, **para quê alocar 32 bits de memória para um elemento que sabemos que precisa de apenas 8bits?**

```kotlin
val numero: Int = 42
```
Se a economia de memória for crucial, você pode considerar usar tipos de dados mais compactos
```kotlin
val pequenoNumero: Byte = 42  // Ocupa 8 bits (1 byte)
```

# Vantagens de alocar mais do que necessário:
## Eficiência 
Usar um tamanho fixo para todos os Int pode simplificar a implementação da linguagem e tornar o acesso à memória mais eficiente.
## Constância 
Processadores modernos são otimizados para trabalhar com tamanhos de palavras que são múltiplos de 8 bits (como 32 bits ou 64 bits). Portanto, usar um tamanho maior pode melhorar a performance do acesso à memória.
## Abstração e Simplicidade
Ao usar tipos de dados primitivos com tamanhos fixos, a linguagem abstrai as complexidades da gestão de memória. Isso simplifica o código e reduz o risco de erros associados ao gerenciamento manual da memória.