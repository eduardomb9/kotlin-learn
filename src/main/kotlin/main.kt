import br.com.alura.bytebank.modelo.Livro
import br.com.alura.bytebank.teste.testaFuncoesAgregacao
import br.com.alura.bytebank.teste.testeArrayIteracao

fun main() {
//    executaTestesConta()
//    testaFuncionarios()
//    testeContaCorrentePoupanca()
//    testaFuncionarioAdmin()
//    testePacotesDiferentesMesmoNomeClasse()
//    testeObject()
//    testeAny()
//    testeEqualsHashCodeToString()
//    testeException()
//    testeNullPointerException()


//    testeArrayIteracao()
//    testaFuncoesAgregacao()

    testaListas()
}

fun testaListas() {
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

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

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
}

// extension function
fun List<Livro>.imprimeComMarcadores() {
    val textoFormatado = this.joinToString("\n") {
        " - ${it.titulo} de ${it.autor}"
    }
    println("#### LISTA DE LIVROS ####\n$textoFormatado")
}