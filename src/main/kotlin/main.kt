fun main() {
//    executaTestesConta()

    val alex = Funcionario("Alex", "123.123.123-12", 2000.0)

    println("Funcionário: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Valor da bonificação: ${alex.bonificacao()}")
}
