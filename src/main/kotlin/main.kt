import br.com.alura.bytebank.modelo.Funcionario

fun main() {
//    executaTestesConta()
//    testaFuncionarios()
//    testeContaCorrentePoupanca()
//    testaFuncionarioAdmin()
//    testePacotesDiferentesMesmoNomeClasse()
//    testeObject()
//    testeAny()
//    testeEqualsHashCodeToString()

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