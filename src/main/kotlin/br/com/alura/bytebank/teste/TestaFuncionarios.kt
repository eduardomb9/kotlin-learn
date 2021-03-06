import br.com.alura.bytebank.modelo.*

fun testaFuncionarios() {
    val alex = Auxiliar("Alex", "123.123.123-12", 1000.0)
    val gerente = Gerente("Paula", "111.111.111-11", 4000.0, "111")
    val diretor = Diretor("Fer", "333.333.333-33", 14000.0, "222", 2000.0)
    val analista = Analista("Fabio", "444.444.444-44", 8000.0)

    println("br.com.alura.bytebank.modelo.Analista: ${alex.nome}")
    println("CPF: ${alex.cpf}")
    println("Salário: ${alex.salario}")
    println("Valor da bonificação: ${alex.bonificacao}")

    println("br.com.alura.bytebank.modelo.Gerente: ${gerente.nome}")
    println("CPF: ${gerente.cpf}")
    println("Salário: ${gerente.salario}")
    println("Valor da bonificação: ${gerente.bonificacao}")
    println("Autenticacao: ${if (gerente.autentica("121")) "Autenticado" else "Falhou"}")

    println("br.com.alura.bytebank.modelo.Diretor: ${diretor.nome}")
    println("CPF: ${diretor.cpf}")
    println("Salário: ${diretor.salario}")
    println("Valor da bonificação: ${diretor.bonificacao}")
    println("PLR: ${diretor.plr}")
    println("Autenticacao: ${if (diretor.autentica("121")) "Autenticado" else "Falhou"}")

    println("br.com.alura.bytebank.modelo.Analista: ${analista.nome}")
    println("CPF: ${analista.cpf}")
    println("Salário: ${analista.salario}")
    println("Valor da bonificação: ${analista.bonificacao}")

    val calculadoraBonificacao = CalculadoraBonificacao()
    calculadoraBonificacao.registro(alex)
    calculadoraBonificacao.registro(diretor)
    calculadoraBonificacao.registro(gerente)
    calculadoraBonificacao.registro(analista)
    println("Valor total de bonificacoes: ${calculadoraBonificacao.total}")
}