fun main() {
    println("Escolha uma operação : 1 = soma, 2 = subtração, 3 = multiplicação,4 = divisão")
    val operacao = readLine()

    println("Digite o primeiro número:")
    val num1 = readLine()?.toIntOrNull()

    println("Digite o segundo número:")
    val num2 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null) {
        when (operacao) {
            "1" -> println("O resultado da soma é: ${num1 + num2}")
            "2" -> println("O resultado da subtração é: ${num1 - num2}")
            "3" -> println("O resultado da multiplicação é: ${num1 * num2}")
            "4" -> println("O resultado da divisão é: ${num1 / num2}")
            else -> println("Operação inválida")
        }

    } else {
        println("Número inválido")
    }

}
