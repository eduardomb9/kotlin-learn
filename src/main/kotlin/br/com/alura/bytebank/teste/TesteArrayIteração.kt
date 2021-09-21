package br.com.alura.bytebank.teste

fun testeArrayIteracao() {
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    var maiorIdade = 0
    for (idade in idades) {
        maiorIdade = if (maiorIdade < idade) idade else maiorIdade
    }
    println(maiorIdade)

    val salarios: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    for (i in salarios.indices)
        salarios[i] = salarios[i] * aumento

    println("Primeiro aumento: ${salarios.contentToString()}")

    salarios.forEachIndexed { i, salario ->
        salarios[i] = salario * aumento
    }

    println("Segundo aumento: ${salarios.contentToString()}")
}