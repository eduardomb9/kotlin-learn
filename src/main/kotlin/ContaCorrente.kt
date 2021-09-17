class ContaCorrente(
    titular: String,
    numero: Int = 0,
) : Conta(titular, numero) {
    override fun saca(valorSaque: Double) {
        if (this.saldo >= valorSaque)
            this.saldo -= valorSaque + 0.1
    }
}