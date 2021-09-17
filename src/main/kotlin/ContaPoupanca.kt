class ContaPoupanca(
    titular: String,
    numero: Int = 0
) : ContaCompleta(titular, numero) {
    override fun saca(valorSaque: Double) {
        if (this.saldo >= valorSaque)
            this.saldo -= valorSaque
    }
}