/*

3. Faça uma função que receba dois números e mostre todos os números entre eles.
Além dos dois números, permita receber um terceiro parâmetro que diz se os números
serão impressos de forma crescente ou decrescente.

Considere que sempre o primeiro valor será menor que o segundo.

Ex:
a = 10, b = 15, Crescente -> 10, 11, 12, 13, 14, 15
a = 10, b = 15, Decrescente -> 15, 14, 13, 12, 11, 10

*/

fun printNumbers (n1: Int, n2: Int, ascending: Boolean) {
    if (ascending) {
        var count = n1
        while (count <= n2) {
            print(" $count ")
            count++
        }
    } else {
        var count = n2
        while (count >= n1) {
            print(" $count ")
            count--
        }
    }
}



fun main() {
    printNumbers(n1 = 10, n2 = 15, ascending = true)
    printNumbers(n1 = 10, n2 = 15, ascending = false)
}