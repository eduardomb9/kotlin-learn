import br.com.alura.bytebank.teste.testeArrayIteracao
import java.math.BigDecimal
import java.math.RoundingMode

fun main() {
//    executaTestesConta()
//    testaFuncionarios()
//    testeContaCorrentePoupanca()
//    testaFuncionarioAdmin()
//    testePacotesDiferentesMesmoNomeClasse()
//    testeObject()
//    testeAny()
//    testeEqualsHashCodeToString()
//    testeException()
//    testeNullPointerException()


//    testeArrayIteracao()
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