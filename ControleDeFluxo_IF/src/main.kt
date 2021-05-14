fun calculaBonus(cargo: String, salario: Float) : Float{
    //Gerente Junior, Gerente Sênior, Coordenador
    return if (cargo == "Coordenador"){
        salario * 1.2f
    }else if (cargo == "Gerente Junior"){
        salario * 1.5f
    } else{
        salario * 2
    }
}


fun main() {
    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Sênior", 1000f))

}