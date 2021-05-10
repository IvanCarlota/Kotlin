
//Função de uma única linha
fun hello(nome: String) : String = "Olá, ${nome}"
fun soma(a: Int, b: Int) : Int = a + b

fun main() {
    //Chamada da função
    println(hello("Ivan"))
    println(soma(a = 2, b = 3))
}