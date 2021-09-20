import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco
import br.com.alura.bytebank.modelo.totalContas
import br.com.alura.bytebank.modelo.novoCliente.Cliente as NovoCliente

fun main() {
    executaTestesConta()
    testaFuncionarios()
    testeContaCorrentePoupanca()
    testaFuncionarioAdmin()
    testePacotesDiferentesMesmoNomeClasse()

    val cliente = Cliente("Bob", "111.111.111-11", "1", Endereco(numero="100", bairro="Bairro 1"))
    println("Cliente: ${cliente.nome} bairro: ${cliente.endereco.bairro} Número: ${cliente.endereco.numero}")
    println("Total de contas criadas: $totalContas")
}

fun testePacotesDiferentesMesmoNomeClasse() {
    val cliente = Cliente("", "", "")
    val novoCliente = NovoCliente("", "", "")
}
