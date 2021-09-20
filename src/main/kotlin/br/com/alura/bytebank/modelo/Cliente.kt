package br.com.alura.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: String,
    val endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autentica(senha: String): Boolean {
        if (this.senha == senha) {
            return true
        }
        return false
    }
}