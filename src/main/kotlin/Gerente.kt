class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String
) : Funcionario(nome, cpf, salario) {

//    fun bonificacao(): Double {
//        return salario * 0.2
//    }

    fun autentica(senha: String): Boolean {
        if (this.senha.equals(senha)) {
            return true
        }
        return false
    }
}