/*
1. Crie uma função que recebe dois valores inteiros e imprima o maior deles. Considere
que não serão informados dois valores iguais.
 */

fun maiorNumero (number1: Float, number2: Float) {
    println("O maior número é: ${if (number1>number2) number1 else number2}")
}

fun main() {
    maiorNumero(number1 = 10.0f, number2 = 15.5f)
}