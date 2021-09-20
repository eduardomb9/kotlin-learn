package br.com.alura.bytebank.modelo

class ContaCorrente(
    titular: String,
    numero: Int = 0,
) : ContaCompleta(titular, numero) {
    override fun saca(valorSaque: Double) {
        if (this.saldo >= valorSaque)
            this.saldo -= valorSaque + 0.1
    }
}