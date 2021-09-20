import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.novoCliente.Cliente as NovoCliente

fun main() {
    executaTestesConta()
    testaFuncionarios()
    testeContaCorrentePoupanca()
    testaFuncionarioAdmin()

    val cliente = Cliente("", "", "")
    val novoCliente = NovoCliente("", "", "")
}
