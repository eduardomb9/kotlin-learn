package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun testeReciever() {
    val sistema = SistemaInterno()
    val cliente = Cliente("Cliente 1", "111.111.111-11", "1111")
    sistema.entra("1111", cliente) {
        println("Autenticado")
    }
    sistema.entraReciever("1111", cliente) {
        pagamento()
    }


}

fun testeRun() {
    val taxaRendimentoMensal = 0.05 / 12

    val contaPoupanca = Cliente("Cliente 1", "111.111.111-11", "1111")
        .let { ContaPoupanca(it, 1) }

    contaPoupanca.run {
        deposita(1000.0)
        saldo * taxaRendimentoMensal
    }.let { rendimentoMensal -> println(rendimentoMensal) }

    run {
        var saldo = contaPoupanca.saldo
        repeat(12) {
            saldo += saldo * taxaRendimentoMensal
        }
        saldo
    }.also(::println)
}

fun testeWith() {
    with(Endereco()) {
        logradouro = "RUA A"
        numero = "1"
        bairro = "Aldeota"
        cidade = "Fortaleza"
        estado = "CE"
        cep = "010101-010"
        complemento = "casa B"
        completo()
    }.also(::println)
}