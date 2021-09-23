package br.com.alura.bytebank.teste

fun testaFuncaoAnonimaELambda() {
    println("LAMBDA")
    val variavelInicializacaoLambda = retornoLambda@{ a: Int, b: Int ->
        if (a > 3) {
            return@retornoLambda a
        }
        return@retornoLambda a + b
    }
    val variavelInicializacaoFuncaoAnonima = fun(a: Int, b: Int): Int {
        if (a > 3) {
            return a
        }
        return a + b
    }
    println(variavelInicializacaoLambda(66, 2))
    println(variavelInicializacaoFuncaoAnonima(2, 2))

    val calculaBonificaca: (Double) -> (Double) = { a -> a + 100 }
    println(calculaBonificaca(119.0))
}

fun testeInicializacaoVariaveisTipoFuncao() {
    val variavelFuncaoReferencia = ::soma
    val variavelFuncaoInstancia: () -> Unit = Teste()
    val variavelFuncaoInstancia2 = TesteSobrecargaOperadorInvoke()
    println(variavelFuncaoInstancia())
    println(variavelFuncaoReferencia(2, 3))
    println(variavelFuncaoInstancia2(3, 5))
}

fun soma(a: Int, b: Int): Double {
    return (a + b).toDouble()
}

class TesteSobrecargaOperadorInvoke : (Int, Int) -> Int {
    override fun invoke(p1: Int, p2: Int): Int {
        return p1 + p2
    }
}

class Teste : () -> Unit {
    override fun invoke() {
        println("print from invoke method")
    }

}
