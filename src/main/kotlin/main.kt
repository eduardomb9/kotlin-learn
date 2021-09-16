fun main() {
    val (conta1, conta2) = criarContas()

//    testaBlocoCondicional(saldo)
//    testaLoops()
//    testaReferencia()

    testaFuncaoDeposito(conta1, conta2)
}

private fun testaFuncaoDeposito(conta1: Conta, conta2: Conta) {
    val valorDeposito = 50.0
    deposita(conta1, valorDeposito)
    deposita(conta2, valorDeposito + 100)
    imprimeInformacoesContas(listOf(conta1, conta2))
}

private fun deposita(conta1: Conta, valorDeposito: Double) {
    conta1.saldo += valorDeposito
}

private fun testaReferencia() {
    val conta1 = Conta()
    val conta2 = conta1
    conta1.titular = "Pedro"
    imprimeInformacoesContas(listOf<Conta>(conta1, conta2))
    conta2.titular = "Maria"
    imprimeInformacoesContas(listOf<Conta>(conta1, conta2))
}

private fun imprimeInformacoesContas(contas: List<Conta>) {
    for (c in contas)
        println("nome do titular: ${c.titular} saldo: ${c.saldo}")
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
}