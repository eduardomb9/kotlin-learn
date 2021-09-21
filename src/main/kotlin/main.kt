import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.teste.testeException
import kotlin.math.log

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
    testeNullPointerException()

}

fun testeNullPointerException() {
    var enderecoNulo: Endereco? = Endereco(logradouro = "RUA B", complemento = "predio")
    var logradouroNaoNulo: String? = enderecoNulo?.logradouro
    println(logradouroNaoNulo)
    println(enderecoNulo?.logradouro?.toString())
    enderecoNulo?.let {
        println(it.logradouro.toString())
        // Elvis Operator ?: da aula
        val complemento = it.complemento?.length ?: 0
        println(complemento)
    }
}

