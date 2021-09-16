class Gerente(
    val nome: String,
    val cpf: String,
    val salario: Double,
    val senha: String
) {
    fun bonificacao(): Double {
        return salario * 0.2
    }

    fun autentica(senha: String): Boolean {
        if (this.senha.equals(senha)) {
            return true
        }
        return false
    }
}