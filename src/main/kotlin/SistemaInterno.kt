class SistemaInterno {
    fun entra(senha: String, funcionario: FuncionarioAdmin) {
        if (funcionario.autentica(senha)) {
            println("${funcionario.nome} autenticado com sucesso!")
        } else {
            println("${funcionario.nome} falhou na autenticacao!")
        }
    }
}