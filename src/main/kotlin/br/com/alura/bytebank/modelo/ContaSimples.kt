package br.com.alura.bytebank.modelo

// construtor primário com modificador de acesso requer a palavra constructor: public constructor
abstract class ContaSimples (
    var titular: Cliente,
    val numero: Int = 0
) {
    var saldo: Double = .0
        protected set

    init {
        println("Conta dx $titular criada!")
    }

    fun deposita(valorDeposito: Double) {
        this.saldo += valorDeposito
    }

    abstract fun saca(valorSaque: Double)

}
