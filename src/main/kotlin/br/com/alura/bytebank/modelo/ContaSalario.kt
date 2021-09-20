package br.com.alura.bytebank.modelo

class ContaSalario(
    titular: String,
    numero: Int = 0,
) : ContaSimples(titular, numero) {
    override fun saca(valorSaque: Double) {
        if (this.saldo >= valorSaque)
            this.saldo -= valorSaque
    }
}