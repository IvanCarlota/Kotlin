/*
2. Faça uma alteração na função do exercício acima e considere que pode haver dois
valores informados iguais. Caso isso aconteça, imprima “Valores iguais.”.
 */

fun maiorNumero (number1: Float, number2: Float) {
    println("O maior número é: ${if (number1>number2) {
        number1
    } else if(number1==number2) {
        "Os valores são iguais"
    } else {
        number2
    }
    }")
}

fun main() {
    maiorNumero(number1 = 12.0f, number2 = 10.0f)
    maiorNumero(number1 = 10.0f, number2 = 10.0f)
    maiorNumero(number1 = 10.0f, number2 = 15.5f)
}