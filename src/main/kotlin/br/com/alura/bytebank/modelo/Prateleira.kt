package br.com.alura.bytebank.modelo

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
) {
    fun organizarPorAutor(): List<Livro> {
        return livros.sortedBy { it.autor }
    }
    fun organizarPorAnoPublicacao() : List<Livro> =
        livros.sortedBy { it.anoPublicacao }

}