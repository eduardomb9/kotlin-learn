// construtor primário com modificador de acesso requer a palavra constructor: public constructor
abstract class Conta (
    var titular: String,
    val numero: Int = 0
) {
    var saldo: Double = .0
        protected set

    init {
        println("Conta dx $titular criada!")
    }

    constructor(ativa: Boolean, titular: String, numero: Int) : this(titular, numero) {
        println("Esta conta está ${if (ativa) "ativa" else "desativada"}!")
    }

    fun deposita(valorDeposito: Double) {
        this.saldo += valorDeposito
    }

    abstract fun saca(valorSaque: Double)

    fun tranfere(valorTransferencia: Double, contaDestino: Conta): Boolean {
        if (saldo >= valorTransferencia) {
            saldo -= valorTransferencia
            contaDestino.deposita(valorTransferencia)
            return true
        }
        return false
    }

}
