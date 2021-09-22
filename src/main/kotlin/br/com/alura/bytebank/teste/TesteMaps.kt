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

    println(pedidos.getOrElse(6, defaultValue = {-1.0}))
    // java.util.NoSuchElementException: Key 6 is missing in the map.
//    pedidos.getValue(6)
    println(pedidos.getOrDefault(6, -1.0))
    pedidos.keys.forEach { i -> println(i) }
    pedidos.values.forEach { i -> println(i) }
    println(pedidos.filter { (chave, valor) -> chave % 2 == 0 && valor > 20.0 })
    println(pedidos.filterValues { valor -> valor > 20.0 })
    println(pedidos.filterKeys { chave -> chave % 2 == 0 })

    println(pedidos + setOf(7 to 40.0, 8 to 10.0))
    println(pedidos + (7 to 40.0))
    println(pedidos - 3)

    pedidos.putAll(setOf(7 to 40.0, 8 to 10.0))
    println(pedidos)

    pedidos += 6 to 20.0
    println(pedidos)

    pedidos -= setOf(7,8)
    println(pedidos)

    pedidos.keys.remove(3)
    println(pedidos)

    pedidos.values.remove(20.0)
    println(pedidos)

    pedidos.values.remove(20.0)
    println(pedidos)

}