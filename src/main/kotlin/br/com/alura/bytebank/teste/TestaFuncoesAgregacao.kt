package br.com.alura.bytebank.teste

import java.math.BigDecimal
import java.math.RoundingMode

fun testaFuncoesAgregacao() {
    val salarios: Array<BigDecimal> = bigDecimalArrayOf("1500.55", "2000.00", "5000.00", "10000.00")
    val idades: IntArray = intArrayOf(25, 11, 19, 10, 33, 20, 55, 40)

    val menorIdade: Int? = idades.minOrNull()
    val maiorIdade: Int? = idades.maxOrNull()
    val media: Double = idades.average()
    println("Menor valor: $menorIdade")
    println("Maior valor: $maiorIdade")
    println("Valor medio: $media")

    val todosMaiores: Boolean = idades.all { it >= 18 }
    val existeMenor: Boolean = idades.any { it < 18 }
    println("Todos os maiores: $todosMaiores")
    println("Existe menor: $existeMenor")

    val contemDez: Boolean = idades.contains(10)
    val idade: Int? = idades.find { it == 10 }
    println("Contem idade 10: $contemDez")
    println("Buscar idade 10: $idade")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()
    println("Salarios com aumento: ${salariosComAumento.contentToString()}")

    val totalSalariosComAumento = salariosComAumento.somatoria()
    println("Soma de todos os salarios: $totalSalariosComAumento")

    val meses = "6".toBigDecimal()
    val totalSalariosProximos6Meses = salariosComAumento.fold(totalSalariosComAumento) { acumulador, valor ->
        acumulador + (valor * meses).setScale(2, RoundingMode.UP)
    }
    println("Total do gasto de salarios com aumento atual mais os proximos 6 meses: $totalSalariosProximos6Meses")

    val mediaMaiores3Salarios = salariosComAumento.sorted().takeLast(3).toTypedArray().media()
    println("Média maiores 3 salários: $mediaMaiores3Salarios")

    val mediaMenores3Salarios = salariosComAumento.sorted().take(3).toTypedArray().media()
    println("Média menores 3 salários: $mediaMenores3Salarios")
}

fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal)
        : BigDecimal {
    return if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }
}

fun bigDecimalArrayOf(vararg valores: String): Array<BigDecimal> {
    return Array<BigDecimal>(valores.size) { i ->
        valores[i].toBigDecimal()
    }
}

fun Array<BigDecimal>.somatoria() : BigDecimal {
    return this.reduce { acumulado, valor ->
        acumulado + valor
    }
}

fun Array<BigDecimal>.media() : BigDecimal {
    return this.somatoria() / this.size.toBigDecimal()
}