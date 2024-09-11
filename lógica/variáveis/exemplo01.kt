package variáveis

fun main() {
    // GLOSSÁRIO (var, val, fun, class)
    // O kotlin automáticamente diz qual tipo da variável armazenada
    //val é uma variável imutável
    //var é uma variável mutável

    val peso: Double = 60.5
    val idade: Int = 31
    val nome: String = "Pedro"


    println(idade)

    println(idade::class)
    println(peso::class)

}