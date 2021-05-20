/*
2. Faça uma função capaz de receber uma String e fazer a inversão.
Valor do parâmetro: Teste
Resultado esperado: etseT
*/
fun reverse (str: String) {

    println("String original: $str")
    print("String invertida: ")
    var size = str.length
    while (size > 0) {
        print(str[size - 1])
        size--
    }
    println()
}

fun main() {
    reverse("Teste")
}