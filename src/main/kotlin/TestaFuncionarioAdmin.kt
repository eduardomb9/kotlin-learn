fun testaFuncionarioAdmin() {
    val gerente = Gerente("Alex", "111.111.111-11", 2000.0, "111")
    val diretor = Diretor("Pedro", "222.222.222-22", 4000.0, "222", 6000.0)

    val sistemaInterno = SistemaInterno()

    sistemaInterno.entra("111", gerente)
    sistemaInterno.entra("111", diretor)
}