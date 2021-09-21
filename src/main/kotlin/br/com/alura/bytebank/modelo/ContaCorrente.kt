package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.SaldoInsuficienteException

class ContaCorrente(
    titular: Cliente,
    numero: Int = 0,
) : ContaCompleta(titular, numero), Autenticavel by titular {
    override fun saca(valorSaque: Double) {
        if (this.saldo >= valorSaque)
            this.saldo -= valorSaque + 0.1
        else throw SaldoInsuficienteException()
    }
}