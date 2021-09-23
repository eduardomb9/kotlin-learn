package br.com.alura.bytebank.teste

fun testaAssociateEGroupBy() {
    val pedidos = listOf(
        Pedido(1, 10),
        Pedido(2, 30),
        Pedido(3, 20),
        Pedido(4, 40)
    )

//    val pedidosMapeados = pedidos.associate { pedido -> pedido.id to pedido }
    val pedidosMapeados = pedidos.associateBy { it.id }
    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido -> (pedido.valor > 15) }
    println(pedidosFreteGratis)

    val pedidosFreteGratisAgrupados = pedidos.groupBy { pedido -> pedido.valor > 15 }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])

    val nomes = listOf("Ana", "Albenes", "Analice", "Pedro", "Paulo", "Tiago", "Tereza")
    val nomesAgrupados = nomes.groupBy { nome -> nome.first() }
    println(nomesAgrupados['P'])
}

data class Pedido(val id: Int, val valor: Int)