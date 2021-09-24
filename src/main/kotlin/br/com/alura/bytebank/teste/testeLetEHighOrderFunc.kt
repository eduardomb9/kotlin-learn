package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

fun testeFuncaoLet() {
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }

    teste(1, {})

    Endereco(complemento = "casa a", logradouro = "rua a").run { ("$logradouro - $complemento").uppercase() }
        .let(block = (::println))

    listOf(
        Endereco(complemento = "casa b"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    ).filter { it.complemento.isNotEmpty() }.let(::println)
}

fun implementandoHighOrderFunction() {
    somaHighOrder(2, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = "111"
        override fun autentica(senha: String): Boolean = this.senha == senha
    }

    SistemaInterno().entra("111", autenticavel) {
        println("faz uma operacao que requer autenticacao!")
    }
}

fun testeRecebeString(valor: String) {
}

//higher order function
fun teste(teste: Int, bloco: () -> Unit) {
    println(bloco)
}

fun somaHighOrder(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Executando funcao soma!")
    resultado(a + b)
    println("Soma executada com sucesso!")
}