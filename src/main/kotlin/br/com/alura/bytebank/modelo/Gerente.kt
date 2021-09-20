package br.com.alura.bytebank.modelo

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double
        get() {
            return salario * 1.2
        }

}