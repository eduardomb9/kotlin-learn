package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaSimples
import br.com.alura.bytebank.modelo.Endereco

fun testeObject() {
    val cliente = Cliente("Bob", "111.111.111-11", "1", Endereco(numero = "100", bairro = "Bairro 1"))
    println("Cliente: ${cliente.nome} bairro: ${cliente.endereco.bairro} Número: ${cliente.endereco.numero}")
    println("Total de contas criadas: ${ContaSimples.totalContas}")

    val c1 = object : Autenticavel {
        val nome: String = "Pedro"
        val cpf: String = "222.222.222-22"
        val senha: String = "2"

        override fun autentica(senha: String) = this.senha == senha
    }
    println("Cliente object expression: ${c1.nome} + ${c1.cpf} +  ${c1.senha} + ${c1.autentica("1")}")
}

fun testePacotesDiferentesMesmoNomeClasse() {
    val cliente = Cliente("", "", "")
    val novoCliente = br.com.alura.bytebank.modelo.novoCliente.Cliente("", "", "")
}
