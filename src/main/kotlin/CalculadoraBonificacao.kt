class CalculadoraBonificacao {
    var total: Double = 0.0
        private set

    fun registro(funcionario: Funcionario) {
        this.total += funcionario.bonificacao
    }
}