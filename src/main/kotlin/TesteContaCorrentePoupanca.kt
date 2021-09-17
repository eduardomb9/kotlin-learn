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