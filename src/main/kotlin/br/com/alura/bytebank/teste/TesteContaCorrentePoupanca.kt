import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import br.com.alura.bytebank.modelo.ContaSalario

fun testeContaCorrentePoupanca() {
    val contaCorrente = ContaCorrente(Cliente("Alex CC", "111.111.111-11", "111"), 1)
    val contaPoupanca = ContaPoupanca(Cliente("Alex CP", "111.111.111-11", "111"), 2)
    val contaSalario = ContaSalario(Cliente("Alex CS", "111.111.111-11", "111"), numero = 3)

    println("Conta antes das operacoes")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
    println("${contaSalario.numero} : R$ ${contaSalario.saldo}")


    contaCorrente.deposita(200.0)
    contaPoupanca.deposita(2000.0)
    contaSalario.deposita(1001.0)

    println("Conta depois do deposito")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
    println("${contaSalario.numero} : R$ ${contaSalario.saldo}")

    contaCorrente.saca(20.0)
    contaPoupanca.saca(200.0)
    contaSalario.saca(200.0)

    println("Conta depois do saque")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")
    println("${contaSalario.numero} : R$ ${contaSalario.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca, "111")
    contaCorrente.transfere(100.0, contaPoupanca, "222")

    println("Conta depois da transferencia")
    println("${contaCorrente.numero} : R$ ${contaCorrente.saldo}")
    println("${contaPoupanca.numero} : R$ ${contaPoupanca.saldo}")

}