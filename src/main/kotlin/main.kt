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
    val conta1 = Conta("Pedro", 1)
    val conta2 = conta1
    imprimeInformacoesContas(listOf(conta1, conta2))
    conta2.titular = "Maria"
    imprimeInformacoesContas(listOf(conta1, conta2))
}

private fun imprimeInformacoesContas(contas: List<Conta>) {
    for (c in contas)
        println("Titular/conta: ${c.titular}/${c.numero} Saldo: ${c.saldo}")
}

private fun criarContas(): Pair<Conta, Conta> {
    val conta1 = Conta(false, "anderson", 1)
    conta1.deposita(100.99)

    // named arguments
    val conta2 = Conta(numero = 2, titular = "ana")
    conta2.deposita(10000.99)
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

// construtor primário
class Conta public constructor(
    var titular: String,
    val numero: Int = 0
) {
    var saldo: Double = .0
        private set

    init {
        println("Conta dx $titular criada!")
    }

    constructor(ativa: Boolean, titular: String, numero: Int) : this(titular, numero) {
        println("Esta conta está ${if (ativa) "ativa" else "desativada"}!")
    }

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