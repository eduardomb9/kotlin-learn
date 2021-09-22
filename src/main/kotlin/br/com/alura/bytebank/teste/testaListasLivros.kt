package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Livro

fun testaListasLivros() {
    val livros: MutableList<Livro> = criarListaLivros()
    val livrosComNulos: MutableList<Livro?> = mutableListOf(livros[0], livros[1], livros[2], livros[3])
    livrosComNulos.add(1, null)
    livrosComNulos.add(3, null)

    livros.add(Livro("Sagarana", "João Guimarães Rosa", 1964))
    livros.imprimeComMarcadores()

    // natural order
    val livrosOrdenados = livros.sorted()
    livrosOrdenados.imprimeComMarcadores()

    // properties order
    val livrosOrdenadosPorAutor = livros.sortedBy { it.autor }
    livrosOrdenadosPorAutor.imprimeComMarcadores()

    val listaTitulos: List<String> = livros.filter { it.autor == "João Guimarães Rosa" }.sorted().map { it.titulo }
    println(listaTitulos)

    // ############################################ lidando com listas com elementos nulos
    livrosComNulos.imprimeComMarcadores()


    // ########################################### agrupando livros por editora
    livros
        .groupBy { it.editora ?: "Editora desconhecida" }
        .forEach { editora, livros ->
            println("$editora: ${livros.joinToString(", ") { it.titulo }}")
        }
}

fun criarListaLivros(
) : MutableList<Livro> {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = 1956
    )
    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = 1942,
        editora = "Editora A"
    )
    val livro3 = Livro(
        titulo = "Memórias Postumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = 1881,
    )
    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = 1865,
        editora = "Editora B"
    )
    return mutableListOf(livro1, livro2, livro3, livro4)
}

// extension function
fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado =
        this.filterNotNull()
            .joinToString("\n") { " - ${it.titulo} de ${it.autor}" }
    println("#### LISTA DE LIVROS ####\n$textoFormatado")
}