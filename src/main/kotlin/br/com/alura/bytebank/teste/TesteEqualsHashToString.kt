package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Endereco

fun testeEqualsHashCodeToString() {
    val end1 = Endereco(numero = "1", logradouro = "Rua A")
    val end2 = Endereco(numero = "2", logradouro = "Rua B")

    println(end1.equals(end2))
    println(end1.equals(end1))
    println(end1.hashCode())
    println(end2.hashCode())
    println(end1.toString())
    println(end2)
}