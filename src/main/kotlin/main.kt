import br.com.alura.bytebank.modelo.*
import br.com.alura.bytebank.teste.testeAny
import br.com.alura.bytebank.teste.testeEqualsHashCodeToString
import br.com.alura.bytebank.teste.testeObject
import br.com.alura.bytebank.teste.testePacotesDiferentesMesmoNomeClasse
import br.com.alura.bytebank.modelo.novoCliente.Cliente as NovoCliente

fun main() {
    executaTestesConta()
    testaFuncionarios()
    testeContaCorrentePoupanca()
    testaFuncionarioAdmin()
    testePacotesDiferentesMesmoNomeClasse()
    testeObject()
    testeAny()
    testeEqualsHashCodeToString()
}
