package br.com.alura.bytebank.teste

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
        throw NumberFormatException("Excecao numberformat")
    } catch (e: ArithmeticException) {
        println(e.localizedMessage)
    } catch (e2: ClassCastException) {
        e2.printStackTrace()
    } catch (e3: NumberFormatException) {
        e3.printStackTrace()
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