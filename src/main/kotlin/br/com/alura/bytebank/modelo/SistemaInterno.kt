package br.com.alura.bytebank.modelo

class SistemaInterno {
    fun entra(senha: String, autenticavel: Autenticavel, autenticado: () -> Unit = {}) {
        if (autenticavel.autentica(senha)) {
            println("Autenticado com sucesso!")
            autenticado()
        } else {
            println("Falhou na autenticacao!")
        }
    }

    fun entraReciever(senha: String, autenticavel: Autenticavel, autenticado: SistemaInterno.() -> Unit = {}) {
        if (autenticavel.autentica(senha)) {
            println("Autenticado com sucesso!")
            autenticado()
        } else {
            println("Falhou na autenticacao!")
        }
    }

    fun pagamento() {
        println("Fazendo uma operacao de pagamento")
    }


}