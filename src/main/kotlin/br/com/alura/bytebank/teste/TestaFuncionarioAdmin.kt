import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Diretor
import br.com.alura.bytebank.modelo.Gerente
import br.com.alura.bytebank.modelo.SistemaInterno

fun testaFuncionarioAdmin() {
    val gerente = Gerente("Alex", "111.111.111-11", 2000.0, "111")
    val diretor = Diretor("Pedro", "222.222.222-22", 4000.0, "222", 6000.0)

    val cliente = Cliente("Thiago", "333.333.333-33", "333")

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra("111", gerente)
    sistemaInterno.entra("111", diretor)
    sistemaInterno.entra("333", cliente)
}