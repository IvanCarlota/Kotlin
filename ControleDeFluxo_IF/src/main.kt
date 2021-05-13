fun calculaBonus(cargo: String, salario: Float) : Float{
    //Gerente Junior, Gerente Sênior, Coordenador
    val bonus: Float
    if (cargo == "Coordenador"){
        bonus = salario * 1.2f
    }else if (cargo == "Gerente Junior"){
        bonus = salario * 1.5f
    } else{
        bonus = salario * 2
    }
    return  bonus
}


fun main() {
    println(calculaBonus("Coordenador", 1000f))
    println(calculaBonus("Gerente Junior", 1000f))
    println(calculaBonus("Gerente Sênior", 1000f))

}