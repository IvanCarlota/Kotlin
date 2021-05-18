fun operacao(a: Int, b: Int, operacao: String): Int {
    when (operacao) {
        "Soma" -> {
            return a + b
        }
        "Subtracao" -> {
            return a - b
        }
        else -> {
            return 0
        }
    }
}

fun main() {
    println("Soma de 2 e 2 resulta em: ${operacao(2, 2, "Soma")}")
    println("Soma de 2 e 2 resulta em: ${operacao(2, 2, "Subtracao")}")
}