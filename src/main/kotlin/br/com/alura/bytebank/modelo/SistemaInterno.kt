package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.modelo.Autenticavel

class SistemaInterno {
    fun entra(senha: String, autenticavel: Autenticavel) {
        if (autenticavel.autentica(senha)) {
            println("Autenticado com sucesso!")
        } else {
            println("Falhou na autenticacao!")
        }
    }
}