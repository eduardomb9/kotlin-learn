package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.exception.FalhaAutenticacaoException

class Cliente(
    val nome: String,
    val cpf: String,
    private val senha: String,
    val endereco: Endereco = Endereco()
) : Autenticavel {
    override fun autentica(senha: String): Boolean {
        if (this.senha != senha) {
            throw FalhaAutenticacaoException()
        }
        return true
    }
}