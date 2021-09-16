class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario) {

    override val bonificacao: Double
        get() {
            return super.bonificacao + salario
        }

    fun autentica(senha: String): Boolean {
        if (this.senha.equals(senha)) {
            return true
        }
        return false
    }
}