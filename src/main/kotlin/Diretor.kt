class Diretor(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String,
    val plr: Double
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario + plr
        }

    fun autentica(senha: String): Boolean {
        if (this.senha.equals(senha)) {
            return true
        }
        return false
    }
}