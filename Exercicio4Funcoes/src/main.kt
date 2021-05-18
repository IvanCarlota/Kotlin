/*

4. Lutadores de boxe são classificados em categorias de acordo com o peso. Escreva um
programa usando o comando when que receba a descrição da categoria e informe o
intervalo de peso usando println.

    Pena: menos de 57 kg
    Leve: mais de 57 kg e menos de 61 kg
    Médio: mais de 61 kg e menos de 73 kg
    Pesado: igual ao acima de 73 kg

*/

fun lutador(categoria: String){
    when(categoria) {
        "Pena" -> {
            println("O lutador peso Pena possui menos de 57 kg")
        }
        "Leve" -> {
            println("O lutador peso Leve possui mais de 57 kg e menos de 61 kg")
        }
        "Médio" -> {
            println("O lutador peso Médio possui mais de 61 kg e menos de 73 kg")
        }

        "Pesado" -> {
            println("O lutador peso Pesado possui peso igual ou acima de 73 kg")
        }
        else -> {
            println("Categoria desconhecida")
        }
    }
}

fun main() {
    lutador("Pena")
    lutador("Leve")
    lutador("Médio")
    lutador("Pesado")
}