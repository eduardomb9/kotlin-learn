fun testaTransferencia(contaCompleta1: ContaCompleta, contaCorrente2: ContaCompleta) {
    val valor = 100.0
    println("Testando transferencia de valor: $valor")
    contaCompleta1.transfere(valorTransferencia = valor, contaSimplesDestino = contaCorrente2)
    imprimeInformacoesContas(listOf(contaCompleta1, contaCorrente2))
}

fun testaFuncaoDeposito(contaSimples1: ContaSimples, contaSimples2: ContaSimples) {
    println("Depositando valores")
    val valorDeposito = 50.0
    contaSimples1.deposita(valorDeposito)
    contaSimples2.deposita(valorDeposito + 100)
    imprimeInformacoesContas(listOf(contaSimples1, contaSimples2))
}

fun testaFuncaoSaque(contaSimples1: ContaSimples, contaSimples2: ContaSimples) {
    println("Sacando valores")
    val valorSaque = 50.0
    contaSimples1.saca(valorSaque)
    contaSimples2.saca(valorSaque + 100)
    imprimeInformacoesContas(listOf(contaSimples1, contaSimples2))
}

fun testaReferencia() {
    val conta1 = ContaCorrente("Pedro", 1)
    val conta2 = conta1
    imprimeInformacoesContas(listOf(conta1, conta2))
    conta2.titular = "Maria"
    imprimeInformacoesContas(listOf(conta1, conta2))
}

fun testaLoops() {
    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    println("while loop")

    var count = 0
    while (count < 5) {
        println(count)
        count++
    }

    loop@ for (i in 0..9) {
        println("i: $i")
        for (j in 0..9) {
            println("j: $j")
            if (j == 3) break@loop
        }
    }
}

fun testaBlocoCondicional(saldo: Double) {
    when {
        saldo > 0 -> {
            println("o saldo é positivo!")
        }
        saldo == 0.0 -> {
            println("o saldo está zerado!")
        }
        else -> {
            println("o saldo está negativo!!!")
        }
    }
}

fun imprimeInformacoesContas(contaSimples: List<ContaSimples>) {
    for (c in contaSimples)
        println("Titular/conta: ${c.titular}/${c.numero} Saldo: ${c.saldo}")
}

fun criarContas(): Pair<ContaCompleta, ContaCompleta> {
    val conta1 = ContaCorrente("anderson", 1)
    conta1.deposita(100.99)

    // named arguments
    val conta2 = ContaPoupanca(numero = 2, titular = "ana")
    conta2.deposita(10000.99)
    return Pair(conta1, conta2)
}

fun executaTestesConta() {
    val (conta1, conta2) = criarContas()
    val contas = listOf(conta1, conta2)
    println("Valores iniciais")

    imprimeInformacoesContas(contas)

    testaBlocoCondicional(-15.0)
    testaLoops()
    testaReferencia()
    testaFuncaoDeposito(conta1, conta2)
    testaFuncaoSaque(conta1, conta2)
    testaTransferencia(conta1, conta2)
}
