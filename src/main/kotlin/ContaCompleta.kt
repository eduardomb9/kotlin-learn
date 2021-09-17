abstract class ContaCompleta (titular: String, numero: Int ): ContaSimples(titular, numero) {

    fun transfere(valorTransferencia: Double, contaSimplesDestino: ContaSimples): Boolean {
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