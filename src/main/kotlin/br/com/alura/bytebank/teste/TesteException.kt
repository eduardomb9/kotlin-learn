package br.com.alura.bytebank.teste

import br.com.alura.bytebank.exception.FalhaAutenticacaoException
import br.com.alura.bytebank.exception.SaldoInsuficienteException
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.Funcionario

fun testeException() {
    println("início main")

    var retorno: Double? = try {
        "1.0".toDouble()
    } catch (e: Exception) {
        null
    }

    val valorFinal: Double? = if (retorno != null) {
        retorno + 0.1
    } else {
        null
    }

    try {
//        throw ArithmeticException("Excecao Arithmatic")
//        throw ClassCastException("Excecao ClassCast")
//        throw NumberFormatException("Excecao numberformat")

        val cc = ContaCorrente(Cliente("Alex", "111.111.111-11", "1"),1)
        cc.deposita(10.0)
//        cc.saca(20.0)
        cc.transfere(5.0, ContaCorrente(Cliente("", "", ""), 1), "2")

    } catch (e: ArithmeticException) {
        println(e.localizedMessage)
    } catch (e: ClassCastException) {
        e.printStackTrace()
    } catch (e: NumberFormatException) {
        e.printStackTrace()
    } catch (e: SaldoInsuficienteException) {
        e.printStackTrace()
    } catch (e: FalhaAutenticacaoException) {
        e.printStackTrace()
    } catch (e: Exception) {
        println("Erro inesperado!")
    }

    println(valorFinal)

    funcao1()
    println("fim main")
}

fun funcao1() {
    println("início funcao1")
    funcao2()
    println("fim funcao1")
}

fun funcao2() {
    println("início funcao2")
    try {
        for (i in 1..5) {
            println(i)
            val funcionario = Any()
            funcionario as Funcionario
        }
    } catch (e: ClassCastException) {
        println("Pegou a exceção class cast")
//        e.printStackTrace()
    }
    println("fim funcao2")
}