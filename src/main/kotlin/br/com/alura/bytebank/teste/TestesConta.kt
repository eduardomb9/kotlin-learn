import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.*

fun testaTransferencia(contaCompleta1: ContaCompleta, contaCorrente2: ContaCompleta) {
    val valor = 100.0
    println("Testando transferencia de valor: $valor")
    try {
        // senha correta = 444
        contaCompleta1.transfere(valorTransferencia = valor, contaSimplesDestino = contaCorrente2, "111")
    } catch (e: FalhaAutenticacaoException) {
        e.printStackTrace()
    }
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
    val valorSaque = 170.0
    try {
        contaSimples1.saca(valorSaque)
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    }
    try {
        contaSimples2.saca(valorSaque)
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    }
    imprimeInformacoesContas(listOf(contaSimples1, contaSimples2))
}

fun testaReferencia() {
    val conta1 = ContaCorrente(Cliente("Pedro", "111.111.111-11", "111"), 1)
    val conta2 = conta1
    imprimeInformacoesContas(listOf(conta1, conta2))
    conta2.titular = Cliente("Maria", "222.222.222-22", "222")
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
            println("o saldo ?? positivo!")
        }
        saldo == 0.0 -> {
            println("o saldo est?? zerado!")
        }
        else -> {
            println("o saldo est?? negativo!!!")
        }
    }
}

fun imprimeInformacoesContas(contaSimples: List<ContaSimples>) {
    for (c in contaSimples)
        println("Titular/conta: ${c.titular}/${c.numero} Saldo: ${c.saldo}")
}

fun criarContas(): Pair<ContaCompleta, ContaCompleta> {
    val conta1 = ContaCorrente(Cliente("Anderson", "444.444.444-44", "444"), 4)
    conta1.deposita(100.99)

    // named arguments
    val conta2 = ContaPoupanca(numero = 2, titular = Cliente("Ana", "333.333.333-33", "333"))
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
