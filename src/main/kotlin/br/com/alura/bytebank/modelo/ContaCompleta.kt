package br.com.alura.bytebank.modelo

abstract class ContaCompleta (titular: Cliente, numero: Int ): ContaSimples(titular, numero) {

    fun transfere(valorTransferencia: Double, contaSimplesDestino: ContaSimples, senha: String): Boolean {
        this.titular.autentica(senha)

        if (saldo >= valorTransferencia) {
            saldo -= valorTransferencia
            contaSimplesDestino.deposita(valorTransferencia)
            return true
        }
        return false
    }

    override fun saca(valorSaque: Double) {
        if (saldo >= valorSaque)
            saldo -= valorSaque
    }

}