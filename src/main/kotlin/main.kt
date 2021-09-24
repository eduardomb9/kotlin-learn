import br.com.alura.bytebank.modelo.Autenticavel
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.SistemaInterno

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
//    testaFuncoesAgregacao()
//    testaListasLivros()
//    testaPrateleira()
//    testeCollections()
//    testeDistinct()
//    testeMaps()
//    testaAssociateEGroupBy()

//    testeInicializacaoVariaveisTipoFuncao()
//    testaFuncaoAnonimaELambda()

    val testeFuncao: () -> Unit
    Endereco().let {
        it
    }
    "".let(::testeRecebeString)
    1.let {
        it
    }

    teste(1, {})

    Endereco(complemento = "casa a", logradouro = "rua a").let { ("${it.logradouro} - ${it.complemento}").uppercase() }
        .let(block = (::println))

    val enderecos = listOf(
        Endereco(complemento = "casa b"),
        Endereco(),
        Endereco(complemento = "Apartamento")
    ).filter { it.complemento.isNotEmpty() }.let(::println))

    implementandoHighOrderFunction()
}

fun implementandoHighOrderFunction() {
    soma(2, 5) {
        println(it)
    }

    val autenticavel = object : Autenticavel {
        val senha = "111"
        override fun autentica(senha: String): Boolean = this.senha == senha
    }

    SistemaInterno().entra("111", autenticavel) {
        println("faz uma operacao que requer autenticacao!")
    }
}

fun testeRecebeString(valor: String) {
}

//higher order function
fun teste(teste: Int, bloco: () -> Unit) {
    println(bloco)
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Executando funcao soma!")
    resultado(a + b)
    println("Soma executada com sucesso!")
}