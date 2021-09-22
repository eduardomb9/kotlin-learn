package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Prateleira

fun testaPrateleira() {
    val prateleira = Prateleira(
        genero = "Literatura",
        livros = criarListaLivros()
    )
//    prateleira.livros.imprimeComMarcadores()

    val porAutor = prateleira.organizarPorAutor()
    val porAnoPublicacao = prateleira.organizarPorAnoPublicacao()

    porAutor.imprimeComMarcadores()
    porAnoPublicacao.imprimeComMarcadores()

}
