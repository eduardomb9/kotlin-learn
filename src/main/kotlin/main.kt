fun main() {
//    executaTestesConta()
//    testaFuncionarios()

    testeContaCorrentePoupanca()
}

fun testeContaCorrentePoupanca() {
    val contaCorrente = ContaCorrente("Alex", 1)
    val contaPoupanca = ContaPoupanca("Alex", 2)

    println("Conta antes das operacoes")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")

    contaCorrente.deposita(200.0)
    contaPoupanca.deposita(2000.0)

    println("Conta depois do deposito")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")

    contaCorrente.saca(20.0)
    contaPoupanca.saca(200.0)

    println("Conta depois do saque")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")

    contaCorrente.tranfere(100.0, contaPoupanca)

    println("Conta depois da transferencia")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
}

fun testaFuncionarios() {
    val alex = Funcionario("Alex", "123.123.123-12", 2000.0)
    val gerente = Gerente("Paula", "111.111.111-11", 4000.0, "111")
    val diretor = Diretor("Fer", "333.333.333-33", 14000.0, "222", 2000.0)
    val analista = Analista("Fabio", "444.444.444-44", 8000.0)

    println("Funcionário: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Valor da bonificação: ${alex.bonificacao}")

    println("Funcionário: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Valor da bonificação: ${gerente.bonificacao}")
    println("Autenticacao: ${if (gerente.autentica("121")) "Autenticado" else "Falhou"}")

    println("Funcionário: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("Valor da bonificação: ${diretor.bonificacao}")
    println("PLR: ${diretor.plr}")
    println("Autenticacao: ${if (diretor.autentica("121")) "Autenticado" else "Falhou"}")

    println("Analisa: ${analista.nome}")
    println("CPF: ${analista.cpf}")
    println("Salário: ${analista.salario}")
    println("Valor da bonificação: ${analista.bonificacao}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registro(alex)
    calculadoraBonificacao.registro(diretor)
    calculadoraBonificacao.registro(gerente)
    calculadoraBonificacao.registro(analista)
    println("Valor total de bonificacoes: ${calculadoraBonificacao.total}")
}
