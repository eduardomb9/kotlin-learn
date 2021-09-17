fun testeContaCorrentePoupanca() {
    val contaCorrente = ContaCorrente("Alex CC", 1)
    val contaPoupanca = ContaPoupanca("Alex CP", 2)
    val contaSalario = ContaSalario("Alex CS", numero = 3)

    println("Conta antes das operacoes")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
    println("${contaSalario.numero} : R$ ${contaSalario.saldo}")


    contaCorrente.deposita(200.0)
    contaPoupanca.deposita(2000.0)
    contaSalario.deposita(1001.0)

    println("Conta depois do deposito")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
    println("${contaSalario.numero} : R$ ${contaSalario.saldo}")

    contaCorrente.saca(20.0)
    contaPoupanca.saca(200.0)
    contaSalario.saca(200.0)

    println("Conta depois do saque")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
    println("${contaSalario.numero} : R$ ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("Conta depois da transferencia")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")

}