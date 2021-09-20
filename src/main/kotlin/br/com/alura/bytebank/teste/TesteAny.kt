package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente

fun testeAny() {
    println(1)
    println(1.0)
    println("String")
    println('a')
    println(true)
    val c = Cliente("Teste", "111", "1")
    println(c)

    val a = Any()

    println("Any type test")
    println(doAny(a))
    println(doAny(c))
    println(doAny(1.0))
}

fun doAny(a : Any): Any {
    return a
}

