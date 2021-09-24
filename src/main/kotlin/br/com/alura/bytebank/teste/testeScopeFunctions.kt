package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testeScopeFunctions() {
    run { println("Funcao run sem extension function") }
    val endereco = Endereco(logradouro = "Rua B", numero = "100")
        .also {
            println("${it.logradouro}")
            println("${it.numero}")
        }.apply {
            logradouro = logradouro.uppercase()
            numero = "101"
        }.also(::println)

    with(endereco) {
        val rua = logradouro
        rua + " perto da praca"
    }.also(::println)
}