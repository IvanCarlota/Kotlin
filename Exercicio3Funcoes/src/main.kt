/*
3. Considere que um abacaxi custa 3 reais quando comprados em quantidade menor que
10. Se for comprado 10 ou mais abacaxis, o valor cai para 2 reais a unidade.
Escreva uma função capaz de receber a quantidade de abacaxis comprados e o valor total
da compra.
*/

fun compra(quantidade: Int){
    val total = if (quantidade < 8 ){
        quantidade * 3
    }else {
        quantidade * 2
    }
    println("Valor total da compra: R$ $total")
}

fun main() {
    compra(quantidade = 10)
}