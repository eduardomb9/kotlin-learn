package br.com.alura.bytebank.teste

fun testeMaps() {
    val pedidos = mutableMapOf(Pair(1, 20.0), 2 to 34.0, 3 to 50.0)
    println(pedidos)

    val pedido: Double? = pedidos[3]
    pedido?.let { println("VALOR: ${it.toBigDecimal()}") }

    pedidos.forEach { key, value -> println("chave: $key valor: $value") }

    println(pedidos[2])
    pedidos[2] = 100.0
    pedidos[4] = 11.5
    pedidos.put(5, 99.0)
    println(pedidos)
    pedidos.putIfAbsent(5, 1.0)
    println(pedidos)
    pedidos.remove(5)
    println(pedidos)
}