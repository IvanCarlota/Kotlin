fun main() {
    //Imprimindo uma cadeia de caracteres com espaço
    val  str = "Ivan Carlota"
    for (c in str){
       print("$c ")
    }
    // imprimindo na tela números de 5 em 5, começando do 0 até o 100 exceto o número 80
    for (i in 0..100 step 5){
        if (i != 80){
            print("$i ")
        }
    }
    // imprimindo na tela números de 100 a 0
    for (j in 100 downTo 0){
       print("$j ")
    }
}