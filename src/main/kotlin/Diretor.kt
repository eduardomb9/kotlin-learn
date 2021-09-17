class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    senha: String,
    val plr: Double
) : FuncionarioAdmin(nome, cpf, salario, senha) {

    override val bonificacao: Double
        get() {
            return salario * 1.2 + plr
        }

}