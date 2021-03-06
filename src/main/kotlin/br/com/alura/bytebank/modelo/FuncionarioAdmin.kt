package br.com.alura.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cpf: String,
    salario: Double,
    protected val senha: String
): Funcionario(nome, cpf, salario), Autenticavel {

    override fun autentica(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}