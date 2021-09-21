package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testeNullPointerException() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "RUA B", complemento = "predio")
    var logradouroNaoNulo: String? = enderecoNulo?.logradouro
    println(logradouroNaoNulo)
    println(enderecoNulo?.logradouro?.toString())
    enderecoNulo?.let {
        println(it.logradouro.toString())
        // Elvis Operator ?: da aula
        val complemento = it.complemento?.length ?: 0
        println(complemento)
        val contatos: Array<String> = Array<String> (4) { "" }
        println(contatos.contentToString())
    }
}