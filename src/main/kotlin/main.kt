fun main() {
//    executaTestesConta()

    val alex = Funcionario("Alex", "123.123.123-12", 2000.0)
    val gerente = Gerente("Paula", "111.111.111-11", 4000.0, "111")

    println("Funcionário: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Valor da bonificação: ${alex.bonificacao()}")

    println("Funcionário: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Valor da bonificação: ${gerente.bonificacao()}")
    println("Autenticacao: ${if (gerente.autentica("121"))  "Autenticado" else "Falhou"}")

}
