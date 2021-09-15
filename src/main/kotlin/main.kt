fun main() {
    var saldo: Double = 0.0
    val numeroConta: Int = 1000

    saldo += 100.50
    saldo -= 1000.50

//    testaValorConta(saldo)

    /*for (i in 5 downTo 1 step 2) {
        println(i)
    }*/

    /*println("while loop")

    var count = 0
    while (count < 5) {
        println(count)
        count++
    }*/

    loop@ for (i in 0..9) {
        println("i: $i")
        for (j in 0..9) {
            println("j: $j")
            if (j == 3) break@loop
        }
    }

    println("O valor do salto atual na conta $numeroConta é: $saldo")
}

private fun testaValorConta(saldo: Double) {
    when {
        saldo > 0 -> {
            println("O saldo é positivo!")
        }
        saldo == 0.0 -> {
            println("O saldo está zerado!")
        }
        else -> {
            println("O saldo está negativo!!!")
        }
    }
}