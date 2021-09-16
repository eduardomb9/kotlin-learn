fun main() {
    val (conta1, conta2) = criarContas()
    val contas = listOf(conta1, conta2)
    println("Valores iniciais")
    imprimeInformacoesContas(contas)

//    testaBlocoCondicional(saldo)
//    testaLoops()
//    testaReferencia()

//    testaFuncaoDeposito(conta1, conta2)
//    testaFuncaoSaque(conta1, conta2)

    testaTransferencia(conta1, conta2)
}

private fun testaTransferencia(conta1: Conta, conta2: Conta) {
    val valor = 100.0
    println("Testando transferencia de valor: $valor")
    conta1.tranfere(valorTransferencia = valor, contaDestino = conta2)
    imprimeInformacoesContas(listOf(conta1, conta2))
}

private fun testaFuncaoDeposito(conta1: Conta, conta2: Conta) {
    println("Depositando valores")
    val valorDeposito = 50.0
    conta1.deposita(valorDeposito)
    conta2.deposita(valorDeposito + 100)
    imprimeInformacoesContas(listOf(conta1, conta2))
}

private fun testaFuncaoSaque(conta1: Conta, conta2: Conta) {
    println("Sacando valores")
    val valorSaque = 50.0
    conta1.saca(valorSaque)
    conta2.saca(valorSaque + 100)
    imprimeInformacoesContas(listOf(conta1, conta2))
}

private fun testaReferencia() {
    val conta1 = Conta()
    val conta2 = conta1
    conta1.titular = "Pedro"
    imprimeInformacoesContas(listOf(conta1, conta2))
    conta2.titular = "Maria"
    imprimeInformacoesContas(listOf(conta1, conta2))
}

private fun imprimeInformacoesContas(contas: List<Conta>) {
    for (c in contas)
        println("Titular/conta: ${c.titular}/${c.numero} Saldo: ${c.saldo}")
}

private fun criarContas(): Pair<Conta, Conta> {
    val conta1 = Conta()
    conta1.titular = "anderson"
    conta1.numero = 1
    conta1.saldo = 100.99

    val conta2 = Conta()
    conta2.titular = "ana"
    conta2.numero = 2
    conta2.saldo = 10000.99
    return Pair(conta1, conta2)
}

private fun testaLoops() {
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

private fun testaBlocoCondicional(saldo: Double) {
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

class Conta {
    var titular: String = ""
    var numero: Int = 0
    var saldo: Double = .0

    fun deposita(valorDeposito: Double) {
        this.saldo += valorDeposito
    }

    fun saca(valorSaque: Double) {
        if (saldo >= valorSaque) this.saldo -= valorSaque
    }

    fun tranfere(valorTransferencia: Double, contaDestino: Conta): Boolean {
        if (saldo >= valorTransferencia) {
            saldo -= valorTransferencia
            contaDestino.deposita(valorTransferencia)
            return true
        }
        return false
    }
}